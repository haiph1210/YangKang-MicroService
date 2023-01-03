package accountservice.YangKang.service;



import accountservice.YangKang.entity.Account;
import accountservice.YangKang.model.request.AccountCreateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAccountService {
    Page<Account> findAll(Pageable pageable);

    Account findById(Integer id);

    void create(AccountCreateRequest request);
}
