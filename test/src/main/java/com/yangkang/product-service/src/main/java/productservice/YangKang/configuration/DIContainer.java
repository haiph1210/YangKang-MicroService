package productservice.YangKang.configuration;


import net.minidev.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIContainer {
    @Bean
    public JSONObject provideJSONPObject(){
        return new JSONObject();
    }
}
