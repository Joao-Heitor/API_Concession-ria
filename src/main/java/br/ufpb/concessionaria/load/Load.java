package br.ufpb.concessionaria.load;

import br.ufpb.concessionaria.models.*;

import br.ufpb.concessionaria.repository.ClienteRepository;
import br.ufpb.concessionaria.repository.VeiculoRepository;
import br.ufpb.concessionaria.repository.VendedorRepository;
import org.springframework.stereotype.Service;

@Service
public class Load {

    VeiculoRepository veiculoRepository;
    VendedorRepository vendedorRepository;
    ClienteRepository clienteRepository;

    public Load() {
    }

    public void carregarCliente(){
        Cliente cliente = new Cliente();

        cliente.setNome("Exemplo da Silva");
        cliente.setCpf("399-498-628-39");
        cliente.setEmail("exemplo@gmail.com");
        cliente.setCnh("0123456789");
        clienteRepository.save(cliente);

    }

    public void carregarVendedor(){
        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Exemplo da Silva");
        vendedor.setCpf("399-498-628-39");
        vendedor.setEmail("exemplo@gmail.com");
        vendedor.setSalario("0123456789");
        vendedorRepository.save(vendedor);

    }

    public void carregarVeiculo(){
        Veiculo veiculo = new Veiculo();

        veiculo.setChassi("0123456789");
        veiculo.setModelo("Etios");
        veiculo.setNome("Exemplo da Silva");
        veiculo.setAno("2016");
        veiculo.setCor("Branco");
        veiculoRepository.save(veiculo);

    }

//    public void carregarVenda(){
//        Venda venda = new Venda();
//
//        clienteRepository.getReferenceById(clienteId)("0123456789");
//        venda.setModelo("Etios");
//        venda.setNome("Exemplo da Silva");
//        venda.setAno("2016");
//        venda.setCor("Branco");
//        veiculoRepository.save(veiculo);
//
//    }

    public void carregar(){
        carregarCliente();
        carregarVendedor();
        carregarVeiculo();

    }
}