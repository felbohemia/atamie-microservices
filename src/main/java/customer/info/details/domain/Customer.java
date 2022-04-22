package customer.info.details.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cusId;

    @NotBlank
    @NotEmpty
    private String firstName;

    @NotBlank
    @NotEmpty
    private String lastName;

    private Long phone;

    @NotBlank
    @NotEmpty
    private String email;

    private LocalDateTime period;

    public Long getCusId() {
        return cusId;
    }

    public Customer(String f, String l, Long p, String e){
        this(null, f,l,p,e, LocalDateTime.now());
    }
}
