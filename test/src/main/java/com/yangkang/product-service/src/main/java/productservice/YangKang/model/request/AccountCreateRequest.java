package productservice.YangKang.model.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import javax.persistence.Column;

@Getter
@Setter
public class AccountCreateRequest {
    private String username;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String fullName;

}
