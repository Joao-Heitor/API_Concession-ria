package br.ufpb.concessionaria.service;

import br.ufpb.concessionaria.models.Vendedor;
import br.ufpb.concessionaria.repository.VendedorRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VendedorService {
    VendedorRepository vendedorRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public VendedorService(VendedorRepository vendedorRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.vendedorRepository = vendedorRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Vendedor createVendedor(Vendedor vendedor){
        vendedor.setPassword(bCryptPasswordEncoder.encode(vendedor.getPassword()));
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
