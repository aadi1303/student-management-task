package net.java.springbootrestapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("net.java.springbootrestapi.repository")
@EntityScan("net.java.springbootrestapi.entity")
@ComponentScan(basePackages = "net.java.springbootrestapi")
public class SpringbootRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApiApplication.class, args);
    }
}
