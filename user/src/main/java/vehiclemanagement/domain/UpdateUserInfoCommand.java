package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateUserInfoCommand {

    private String juminNum;
    private Address address;
}
