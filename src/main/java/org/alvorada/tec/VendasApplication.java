package org.alvorada.tec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("nomeDaAplicacao") // Uso o qualifier, para "achar" o bean
    private String nomeDaAplicacao;

    @Gato // Injetando minha Interface
    private Animal animal;

    @Value("${application.nomeDoAmbiente}")
    private String nomeDoAmbiente;

    @Value("${application.testeArquivoProperties}")
    private String testeAppProperties;

    @Bean
    @Qualifier("gato")
    public CommandLineRunner executar() {
        return args -> {
            animal.fazerBarulho();
        };
    }

    @GetMapping("/ambiente")
    public String nomeDoAmbiente() {
        return nomeDoAmbiente;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World - Spring Boot";
    }

    @GetMapping("/")
    public String nomeDaAplicacao() {
        return nomeDaAplicacao.toUpperCase();
    }


    @GetMapping("/testeAppProperties")
    public String testeAppProperties() {
        return testeAppProperties;
    }

    //Eu digitei psvm e o intelliJ transformou em public static....
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
