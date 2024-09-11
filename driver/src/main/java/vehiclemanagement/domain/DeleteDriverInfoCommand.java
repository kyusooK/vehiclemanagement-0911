package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DeleteDriverInfoCommand {

    private String driverName;
}
