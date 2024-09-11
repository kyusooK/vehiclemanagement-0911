package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DeleteVehicleInfoCommand {

    private String brandModel;
    private String vehicleName;
    private String usage;
    private String ownershipCompany;
    private String division;
    private String operationDepartment;
    private String registrationDate;
    private String ownershipType;
    private String inUse;
}
