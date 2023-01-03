package accountservice.YangKang.service.impl;


import accountservice.YangKang.entity.Account;
import accountservice.YangKang.model.request.AccountCreateRequest;
import accountservice.YangKang.repository.AccountRepository;
import accountservice.YangKang.service.IAccountService;
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
