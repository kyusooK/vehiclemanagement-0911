package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import vehiclemanagement.domain.*;
import vehiclemanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserInfoCreated extends AbstractEvent {

    private String name;
    private String juminNum;
    private String birthDate;
    private Address address;

    public UserInfoCreated(UserInfo aggregate) {
        super(aggregate);
    }

    public UserInfoCreated() {
        super();
    }
}
//>>> DDD / Domain Event
