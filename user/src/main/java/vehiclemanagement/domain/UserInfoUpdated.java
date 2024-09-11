package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import vehiclemanagement.domain.*;
import vehiclemanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserInfoUpdated extends AbstractEvent {

    private String juminNum;
    private Address address;

    public UserInfoUpdated(UserInfo aggregate) {
        super(aggregate);
    }

    public UserInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
