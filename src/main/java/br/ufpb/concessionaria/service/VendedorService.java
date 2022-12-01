package br.ufpb.concessionaria.service;

import br.ufpb.concessionaria.models.Vendedor;
import br.ufpb.concessionaria.repository.VendedorRepository;

import java.util.List;
import java.util.Optional;

public class VendedorService {
    VendedorRepository vendedorRepository;

    public VendedorService(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    public Vendedor createVendedor(Vendedor vendedor){
        return vendedorRepository.save(vendedor);
    }

    public List<Vendedor> listVendedores(){
        return vendedorRepository.findAll();
    }
    public Vendedor getVendedor(Long vendedorId){
        Optional<Vendedor> optionalVendedor = vendedorRepository.findById(vendedorId);
        if (optionalVendedor.isPresent()){
            return vendedorRepository.getReferenceById(vendedorId);
        }
        return null;
    }

    public Vendedor updateVendedor(Long vendedorId, Vendedor vendedor){
        Optional<Vendedor> optionalVendedor = vendedorRepository.findById(vendedorId);
        if (optionalVendedor.isPresent()){
            Vendedor toUpdate = optionalVendedor.get();
            toUpdate.getNome();
            toUpdate.getCpf();
            toUpdate.getEmail();
            toUpdate.getSalario();
            return toUpdate;
        }
        return null;
    }

    public void deleteVendedor(Long vendedorId){
        Optional<Vendedor> optionalVendedor = vendedorRepository.findById(vendedorId);
        if (optionalVendedor.isPresent()){
            vendedorRepository.deleteById(vendedorId);
        }
    }
}
