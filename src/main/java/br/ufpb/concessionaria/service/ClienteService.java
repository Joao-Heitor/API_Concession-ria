package br.ufpb.concessionaria.service;

import br.ufpb.concessionaria.models.Cliente;
import br.ufpb.concessionaria.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listCliente(){
        return clienteRepository.findAll();
    }

    public Cliente getCliente(Long clienteId){
        Optional<Cliente> optionalCliente = clienteRepository.findById(clienteId);
        if (optionalCliente.isPresent()){
            return clienteRepository.getReferenceById(clienteId);
        }
        return null;
    }
    public Cliente updateCliente(Long clienteId, Cliente cliente){
        Optional<Cliente> optionalCliente = clienteRepository.findById(clienteId);
        if (optionalCliente.isPresent()){
            Cliente toUpdate = optionalCliente.get();
            toUpdate.setNome(cliente.getNome());
            toUpdate.setCpf(cliente.getCpf());
            toUpdate.setEmail(cliente.getEmail());
            toUpdate.setCnh(cliente.getCnh());
            return toUpdate;
        }
        return null;
    }

    public void deleteCliente(Long clienteId){
        Optional<Cliente> optionalCliente = clienteRepository.findById(clienteId);
        if (optionalCliente.isPresent()){
            clienteRepository.deleteById(clienteId);
        }
    }
}
