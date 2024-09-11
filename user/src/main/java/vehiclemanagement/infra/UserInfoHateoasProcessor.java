package vehiclemanagement.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import vehiclemanagement.domain.*;

@Component
public class UserInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserInfo>> {

    @Override
    public EntityModel<UserInfo> process(EntityModel<UserInfo> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() + "//user-info/{id}"
                )
                .withRel("/user-info/{id}")
        );

        return model;
    }
}
