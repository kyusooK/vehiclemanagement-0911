package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import vehiclemanagement.domain.*;
import vehiclemanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class VehicleInfoDeleted extends AbstractEvent {

    private String brandModel;
    private String vehicleName;
    private String usage;
    private String ownershipCompany;
    private String division;
    private String operationDepartment;
    private String registrationDate;
    private String ownershipType;
    private String inUse;

    public VehicleInfoDeleted(VehicleInfo aggregate) {
        super(aggregate);
    }

    public VehicleInfoDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
