package org.alvorada.tec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Importando minha Annotation personalizada, que vai transformar minha classe em uma Configuration para que eu possa usar o bean
@Development
public class MinhaAnnotation {

    @Bean(name = "nomeDaAplicacaoAnnotation") //posso dar o nome diferente, mas por convenção mantemos o mesmo nome do método
    public String nomeDaAplicacaoAnnotation() {
        return "Sistema de Vendas Annotation";
    }
}
