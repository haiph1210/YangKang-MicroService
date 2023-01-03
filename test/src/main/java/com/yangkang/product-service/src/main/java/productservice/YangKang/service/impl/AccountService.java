package productservice.YangKang.service.impl;

import com.YangKang.entity.Account;
import com.YangKang.model.request.AccountCreateRequest;
import com.YangKang.repository.AccountRepository;
import com.YangKang.service.IAccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository repository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public Page<Account> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
    @Override
    public Account findById(Integer id){
        return repository.findById(id).orElse(null);
    }
    @Override
    public void create(AccountCreateRequest request){
        Account account = mapper.map(request,Account.class);
        repository.save(account);
    }

}
