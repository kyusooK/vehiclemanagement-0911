package vehiclemanagement.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import vehiclemanagement.domain.*;

@Component
public class VehicleInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VehicleInfo>> {

    @Override
    public EntityModel<VehicleInfo> process(EntityModel<VehicleInfo> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//vehicle-info/update"
                )
                .withRel("/vehicle-info/update")
        );

        return model;
    }
}
