package productservice.YangKang.service;

import com.YangKang.entity.Account;
import com.YangKang.model.request.AccountCreateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAccountService {
    Page<Account> findAll(Pageable pageable);

    Account findById(Integer id);

    void create(AccountCreateRequest request);
}
