package net.java.springbootrestapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "net.java.springbootrestapi.model")
public class SpringbootRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApiApplication.class, args);
    }
}
