package br.ufpb.concessionaria.service;

import br.ufpb.concessionaria.models.Venda;
import br.ufpb.concessionaria.repository.VendaRepository;
import org.springframework.stereotype.Service;

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
        return null;
    }
    public Venda updateVenda(Long vendaId, Venda venda){
        Optional<Venda> optionalVenda = vendaRepository.findById(vendaId);
        if (optionalVenda.isPresent()){
            Venda toUpdate = optionalVenda.get();
            toUpdate.setClienteId(venda.getClienteId());
            toUpdate.setVendedorId(venda.getVendedorId());
            toUpdate.setVeiculoId(venda.getVeiculoId());

            return toUpdate;
        }
        return null;
    }

    public void deleteVenda(Long vendaId){
        Optional<Venda> optionalVenda = vendaRepository.findById(vendaId);
        if (optionalVenda.isPresent()){
            vendaRepository.deleteById(vendaId);
        }
    }
}
