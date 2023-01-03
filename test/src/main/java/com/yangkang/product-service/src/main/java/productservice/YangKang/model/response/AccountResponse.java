package productservice.YangKang.model.response;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import javax.persistence.Column;

@Getter
@Setter
public class AccountResponse {

    private String username;

    private String email;
    private String fullName;
}
