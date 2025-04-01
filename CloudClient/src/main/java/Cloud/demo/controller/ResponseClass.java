package Cloud.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ResponseClass {

    @Value("${active.profiles}")
    private String response;

    @GetMapping("/")
    public String getResponse() {
        return response;
    }
}
