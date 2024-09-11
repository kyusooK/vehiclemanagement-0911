package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateDriverInfoCommand {

    private String driverName;
    private String companyName;
    private String affiliation;
    private String contact;
    private String permission;
    private Boolean isActive;
}
