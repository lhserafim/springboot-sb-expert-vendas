package org.alvorada.tec.repository;

import org.alvorada.tec.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
// Graças a esta anotação, o SB sabe que ele precisa scanear esta classe, fazer a conexão com o BD, cria uma instancia (Singleton) e carregar no container de injeções
public class ClientesRepository {
    public void persistir(Cliente cliente) {
        // acessa a base e salva o cliente
    }
}
