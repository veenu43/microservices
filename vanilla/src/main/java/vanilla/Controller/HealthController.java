package vanilla.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String health() {
        System.out.println("+++++++++++HealthController++++++++++");
        return appName;
    }
}
