package org.alvorada.tec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "nomeDaAplicacao") //posso dar o nome diferente, mas por convenção mantemos o mesmo nome do método
    public String nomeDaAplicacao() {
        return "Sistema de Vendas";
    }
}
