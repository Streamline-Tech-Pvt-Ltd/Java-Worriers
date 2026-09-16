package in.st.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

    // 1. This is the missing entry point that boots up the server
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
