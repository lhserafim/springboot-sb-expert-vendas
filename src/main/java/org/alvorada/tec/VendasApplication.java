package org.alvorada.tec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("nomeDaAplicacao")
    private String nomeDaAplicacao;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World - Spring Boot";
    }

    @GetMapping("/")
    public String nomeDaAplicacao() {
        return nomeDaAplicacao.toUpperCase();
    }
    //Eu digitei psvm e o intelliJ transformou em public static....
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
