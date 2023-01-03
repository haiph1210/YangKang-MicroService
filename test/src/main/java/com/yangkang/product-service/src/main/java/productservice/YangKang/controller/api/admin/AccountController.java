package productservice.YangKang.controller.api.admin;

import com.YangKang.entity.Account;
import com.YangKang.model.request.AccountCreateRequest;
import com.YangKang.model.response.AccountResponse;
import com.YangKang.service.IAccountService;

import net.minidev.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {
    @Autowired
    private IAccountService service;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private JSONObject message;

    @GetMapping()
    public Page<AccountResponse> findAll(Pageable pageable){
        Page<Account> page = service.findAll(pageable);
        List<Account> accounts = page.getContent();
        List<AccountResponse> responses = mapper.map(accounts,new TypeToken<List<AccountResponse>>(){}.getType());
        return new PageImpl<>(responses,pageable,page.getTotalPages());
    }
    @GetMapping("/id")
    public AccountResponse findById(@PathVariable(value = "id") Integer id){
        Account account = service.findById(id);
        return mapper.map(account,AccountResponse.class);
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody AccountCreateRequest request){
        service.create(request);
        message.put("Result: " , "Account create successfully!");
        message.put("status: " , 200);
        return ResponseEntity.status(HttpStatus.OK).body(message.toString());
    }
}
