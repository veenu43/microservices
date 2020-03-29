package client.config.Config;

import org.springframework.beans.factory.annotation.Value;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Value("${user.role}")
    public String role;

}
