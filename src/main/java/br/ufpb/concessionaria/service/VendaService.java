package br.ufpb.concessionaria.service;

import br.ufpb.concessionaria.exception.ItemNotFoundException;
import br.ufpb.concessionaria.models.Veiculo;
import br.ufpb.concessionaria.models.Venda;
import br.ufpb.concessionaria.repository.VendaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class VendaService {
    VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public Venda createVenda(Venda venda){
        return vendaRepository.save(venda);
    }

    public List<Venda> listVenda(){
        return vendaRepository.findAll();
    }

    public Venda getVenda(Long vendaId){
        Optional<Venda> optionalVenda = vendaRepository.findById(vendaId);
        if (optionalVenda.isPresent()){
            return vendaRepository.getReferenceById(vendaId);
        }
        else {
            throw new ItemNotFoundException("Venda " + vendaId + " Não existe!");
        }
    }
    public Venda updateVenda(Long vendaId, Venda venda){
        Optional<Venda> optionalVenda = vendaRepository.findById(vendaId);
        if (optionalVenda.isPresent()){
            Venda toUpdate = optionalVenda.get();
            toUpdate.setCliente(venda.getCliente());
            toUpdate.setVendedor(venda.getVendedor());
            toUpdate.setVeiculos(venda.getVeiculos());

            return toUpdate;
        }
        else {
            throw new ItemNotFoundException("Venda " + vendaId + " Não existe!");
        }
    }

    public void deleteVenda(Long vendaId){
        Optional<Venda> optionalVenda = vendaRepository.findById(vendaId);
        if (optionalVenda.isPresent()){
            Collection<Veiculo> veiculos = optionalVenda.get().getVeiculos();
            veiculos.stream().forEach(veiculo -> veiculos.remove(veiculo));
            vendaRepository.deleteById(vendaId);
        }
        else {
            throw new ItemNotFoundException("Venda " + vendaId + " Não existe!");
        }
    }
}
