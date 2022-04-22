package customer.info.details.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    @NotBlank
    @NotEmpty
    private String fname;
    @NotBlank
    @NotEmpty
    private String lname;

    private Long phone;
    @NotBlank
    @NotEmpty
    private String email;

    public Long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
