package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import vehiclemanagement.domain.*;
import vehiclemanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DriverInfoUpdated extends AbstractEvent {

    private String driverName;
    private String companyName;
    private String affiliation;
    private String contact;
    private String permission;
    private Boolean isActive;

    public DriverInfoUpdated(DriverInfo aggregate) {
        super(aggregate);
    }

    public DriverInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
