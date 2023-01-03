package accountservice.YangKang.fegin.proxy;
import accountservice.YangKang.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product-service")

public interface ProductProxy {
    @GetMapping("/api/product/id/{}")
    public Account getAll();
}
