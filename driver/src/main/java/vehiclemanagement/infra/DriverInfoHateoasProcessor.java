package vehiclemanagement.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import vehiclemanagement.domain.*;

@Component
public class DriverInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DriverInfo>> {

    @Override
    public EntityModel<DriverInfo> process(EntityModel<DriverInfo> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "//driver/update")
                .withRel("/driver/update")
        );

        return model;
    }
}
