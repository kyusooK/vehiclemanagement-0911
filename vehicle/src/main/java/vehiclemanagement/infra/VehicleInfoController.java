package vehiclemanagement.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vehiclemanagement.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/vehicleInfos")
@Transactional
public class VehicleInfoController {

    @Autowired
    VehicleInfoRepository vehicleInfoRepository;

    @RequestMapping(
        value = "/vehicleInfos/{id}//vehicle-info/update",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public VehicleInfo updateVehicleInfo(
        @PathVariable(value = "id") Long id,
        @RequestBody UpdateVehicleInfoCommand updateVehicleInfoCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /vehicleInfo/updateVehicleInfo  called #####"
        );
        Optional<VehicleInfo> optionalVehicleInfo = vehicleInfoRepository.findById(
            id
        );

        optionalVehicleInfo.orElseThrow(() -> new Exception("No Entity Found"));
        VehicleInfo vehicleInfo = optionalVehicleInfo.get();
        vehicleInfo.updateVehicleInfo(updateVehicleInfoCommand);

        vehicleInfoRepository.save(vehicleInfo);
        return vehicleInfo;
    }
}
//>>> Clean Arch / Inbound Adaptor
