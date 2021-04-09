package org.alvorada.tec.service;


import org.alvorada.tec.model.Cliente;
import org.alvorada.tec.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    ClientesRepository clientesRepository;

    // Não é necessário injetar no construtor. Posso colocar a notation em cima do atributo e já vai funcionar.
//    @Autowired
//    public ClientesService(ClientesRepository clientesRepository) {
//        this.clientesRepository = clientesRepository;
//    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.clientesRepository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente) {

    }
}
