package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import vehiclemanagement.domain.*;
import vehiclemanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserInfoDeleted extends AbstractEvent {

    private String juminNum;

    public UserInfoDeleted(UserInfo aggregate) {
        super(aggregate);
    }

    public UserInfoDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
