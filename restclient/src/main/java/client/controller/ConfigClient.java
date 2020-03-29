package client.controller;

import client.config.Config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RefreshScope
public class ConfigClient {

    //@Value("${user.role}")
    //private String role;

    @Autowired
    private Configuration configuration;
    @GetMapping(
            value = "/whoami/{username}",
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello!  You're %s and you'll become a(n) %s...\n", username, configuration.role);
    }

}
