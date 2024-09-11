package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import vehiclemanagement.domain.*;
import vehiclemanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class VehicleInfoUpdated extends AbstractEvent {

    private String brandModel;
    private String vehicleName;
    private String usage;
    private String ownershipCompany;
    private String division;
    private String operationDepartment;
    private String registrationDate;
    private String ownershipType;
    private String inUse;

    public VehicleInfoUpdated(VehicleInfo aggregate) {
        super(aggregate);
    }

    public VehicleInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
