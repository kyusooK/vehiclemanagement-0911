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
// @RequestMapping(value="/driverInfos")
@Transactional
public class DriverInfoController {

    @Autowired
    DriverInfoRepository driverInfoRepository;

    @RequestMapping(
        value = "/driverInfos/{id}//driver/update",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public DriverInfo updateDriverInfo(
        @PathVariable(value = "id") Long id,
        @RequestBody UpdateDriverInfoCommand updateDriverInfoCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /driverInfo/updateDriverInfo  called #####");
        Optional<DriverInfo> optionalDriverInfo = driverInfoRepository.findById(
            id
        );

        optionalDriverInfo.orElseThrow(() -> new Exception("No Entity Found"));
        DriverInfo driverInfo = optionalDriverInfo.get();
        driverInfo.updateDriverInfo(updateDriverInfoCommand);

        driverInfoRepository.save(driverInfo);
        return driverInfo;
    }
}
//>>> Clean Arch / Inbound Adaptor
