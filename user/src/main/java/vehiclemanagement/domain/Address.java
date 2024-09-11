package vehiclemanagement.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

//<<< DDD / Value Object
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String street;

    private String city;

    private String state;

    private String country;

    private String zipcode;
}
//>>> DDD / Value Object
