package vehiclemanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateUserInfoCommand {

    private String name;
    private String juminNum;
    private String birthDate;
    private Address address;
}
