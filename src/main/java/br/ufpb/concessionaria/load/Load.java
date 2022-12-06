package br.ufpb.concessionaria.load;

import br.ufpb.concessionaria.models.*;

import br.ufpb.concessionaria.repository.ClienteRepository;
import br.ufpb.concessionaria.repository.VeiculoRepository;
import br.ufpb.concessionaria.repository.VendaRepository;
import br.ufpb.concessionaria.repository.VendedorRepository;
import org.springframework.stereotype.Service;

@Service
public class Load {


    VeiculoRepository veiculoRepository;

    VendaRepository vendaRepository;

    VendedorRepository vendedorRepository;
    ClienteRepository clienteRepository;



    public void carregarCliente(){
        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();

        usuario.setNome("Exemplo da Silva");
        usuario.setCpf("399-498-628-39");
        usuario.setEmail("exemplo@gmail.com");
        cliente.setCnh("0123456789");
        clienteRepository.save(cliente);

    }

    public void carregarVendedor(){
        Usuario usuario = new Usuario();
        Vendedor vendedor = new Vendedor();

        usuario.setNome("Exemplo da Silva");
        usuario.setCpf("399-498-628-39");
        usuario.setEmail("exemplo@gmail.com");
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