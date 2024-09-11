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
// @RequestMapping(value="/userInfos")
@Transactional
public class UserInfoController {

    @Autowired
    UserInfoRepository userInfoRepository;

    @RequestMapping(
        value = "/userInfos/{id}//user-info/{id}",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public UserInfo updateUserInfo(
        @PathVariable(value = "id") Long id,
        @RequestBody UpdateUserInfoCommand updateUserInfoCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /userInfo/updateUserInfo  called #####");
        Optional<UserInfo> optionalUserInfo = userInfoRepository.findById(id);

        optionalUserInfo.orElseThrow(() -> new Exception("No Entity Found"));
        UserInfo userInfo = optionalUserInfo.get();
        userInfo.updateUserInfo(updateUserInfoCommand);

        userInfoRepository.save(userInfo);
        return userInfo;
    }
}
//>>> Clean Arch / Inbound Adaptor
