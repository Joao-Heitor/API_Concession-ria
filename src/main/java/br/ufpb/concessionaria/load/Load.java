package br.ufpb.concessionaria.load;

import br.ufpb.concessionaria.models.*;

import br.ufpb.concessionaria.repository.ClienteRepository;
import br.ufpb.concessionaria.repository.VeiculoRepository;
import br.ufpb.concessionaria.repository.VendedorRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Load {

    VeiculoRepository veiculoRepository;
    VendedorRepository vendedorRepository;
    ClienteRepository clienteRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Load(VeiculoRepository veiculoRepository, VendedorRepository vendedorRepository, ClienteRepository clienteRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.veiculoRepository = veiculoRepository;
        this.vendedorRepository = vendedorRepository;
        this.clienteRepository = clienteRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void carregarCliente(){
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();

        cliente.setNome("Luiz da Silva");
        cliente.setCpf("399-498-628-39");
        cliente.setEmail("Luiz@gmail.com");
        cliente.setCnh("9323956999");

        cliente2.setNome("Carlos Alberto");
        cliente2.setCpf("976-947-673-10");
        cliente2.setEmail("carlos@gmail.com");
        cliente2.setCnh("0197643904");

        cliente3.setNome("Roberto Palmeira");
        cliente3.setCpf("672-637-974-37");
        cliente3.setEmail("roberto@gmail.com");
        cliente3.setCnh("7964380193");

        cliente4.setNome("André Vargas");
        cliente4.setCpf("319-439-193-88");
        cliente4.setEmail("andre@gmail.com");
        cliente4.setCnh("9734601437");

        cliente5.setNome("José Clemente");
        cliente5.setCpf("932-246-763-11");
        cliente5.setEmail("jose@gmail.com");
        cliente5.setCnh("3764928346");
        clienteRepository.save(cliente);
        clienteRepository.save(cliente2);
        clienteRepository.save(cliente3);
        clienteRepository.save(cliente4);
        clienteRepository.save(cliente5);

    }



    public void carregarVendedor(){
        Vendedor vendedor = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        Vendedor vendedor3 = new Vendedor();
        Vendedor vendedor4 = new Vendedor();
        Vendedor vendedor5 = new Vendedor();

        vendedor.setNome("Januário Guimarães");
        vendedor.setCpf("943-317-973-37");
        vendedor.setEmail("januario@gmail.com");
        vendedor.setSalario("7349831604");
        vendedor.setUsername("user");
        vendedor.setPassword(bCryptPasswordEncoder.encode("123"));

        vendedor2.setNome("Kevin Freire");
        vendedor2.setCpf("768-197-376-76");
        vendedor2.setEmail("kevin@gmail.com");
        vendedor2.setSalario("7349700197");
        vendedor2.setUsername("user2");
        vendedor2.setPassword(bCryptPasswordEncoder.encode("123"));

        vendedor3.setNome("Julio Paulo");
        vendedor3.setCpf("221-976-379-77");
        vendedor3.setEmail("julio@gmail.com");
        vendedor3.setSalario("4337946834");
        vendedor3.setUsername("user3");
        vendedor3.setPassword(bCryptPasswordEncoder.encode("123"));

        vendedor4.setNome("Raul Alburquerque");
        vendedor4.setCpf("943-649-777-666");
        vendedor4.setEmail("raul@gmail.com");
        vendedor4.setSalario("9731887694");
        vendedor4.setUsername("user4");
        vendedor4.setPassword(bCryptPasswordEncoder.encode("123"));

        vendedor5.setNome("Tiago Beltrão");
        vendedor5.setCpf("734-493-197-99");
        vendedor5.setEmail("tiago@gmail.com");
        vendedor5.setSalario("0055937834");
        vendedor5.setUsername("user5");
        vendedor5.setPassword(bCryptPasswordEncoder.encode("123"));

        vendedorRepository.save(vendedor);
        vendedorRepository.save(vendedor2);
        vendedorRepository.save(vendedor3);
        vendedorRepository.save(vendedor4);
        vendedorRepository.save(vendedor5);

    }

    public void carregarVeiculo(){
        Veiculo veiculo = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo veiculo3 = new Veiculo();
        Veiculo veiculo4 = new Veiculo();
        Veiculo veiculo5 = new Veiculo();

        veiculo.setChassi("0123456789");
        veiculo.setModelo("Hatch");
        veiculo.setNome("Neo");
        veiculo.setAno("2016");
        veiculo.setCor("Branca");
        veiculo.setChassi("0123456789");
        veiculo.setModelo("Sedan");
        veiculo.setNome("T20");
        veiculo.setAno("2019");
        veiculo.setCor("Pickup");
        veiculo.setChassi("0123456789");
        veiculo.setModelo("SUV");
        veiculo.setNome("Osiris");
        veiculo.setAno("2014");
        veiculo.setCor("Prata");
        veiculo.setChassi("0123456789");
        veiculo.setModelo("Cabine");
        veiculo.setNome("Cara-cara");
        veiculo.setAno("2012");
        veiculo.setCor("Azul");
        veiculo.setChassi("0123456789");
        veiculo.setModelo("Cabine Dupla");
        veiculo.setNome("ItaliRXS");
        veiculo.setAno("2010");
        veiculo.setCor("Amarela");
        veiculoRepository.save(veiculo);
        veiculoRepository.save(veiculo2);
        veiculoRepository.save(veiculo3);
        veiculoRepository.save(veiculo4);
        veiculoRepository.save(veiculo5);

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

    public void carregandoCliente(){
        carregarCliente();
    }

    public void carregandoVendedor(){
        carregarVendedor();
    }

    public void carregandoVeiculo(){
        carregarVeiculo();

    }
}
