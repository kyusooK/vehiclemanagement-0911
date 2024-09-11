package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import vehiclemanagement.VehicleApplication;
import vehiclemanagement.domain.VehicleInfoCreated;
import vehiclemanagement.domain.VehicleInfoDeleted;

@Entity
@Table(name = "VehicleInfo_table")
@Data
//<<< DDD / Aggregate Root
public class VehicleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brandModel;

    private String vehicleName;

    private String usage;

    private String ownershipCompany;

    private String division;

    private String operationDepartment;

    private String registrationDate;

    private String ownershipType;

    private String inUse;

    @PostPersist
    public void onPostPersist() {
        VehicleInfoCreated vehicleInfoCreated = new VehicleInfoCreated(this);
        vehicleInfoCreated.publishAfterCommit();

        VehicleInfoDeleted vehicleInfoDeleted = new VehicleInfoDeleted(this);
        vehicleInfoDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VehicleInfoRepository repository() {
        VehicleInfoRepository vehicleInfoRepository = VehicleApplication.applicationContext.getBean(
            VehicleInfoRepository.class
        );
        return vehicleInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateVehicleInfo(
        UpdateVehicleInfoCommand updateVehicleInfoCommand
    ) {
        //implement business logic here:

        VehicleInfoUpdated vehicleInfoUpdated = new VehicleInfoUpdated(this);
        vehicleInfoUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
