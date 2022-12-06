package br.ufpb.concessionaria.load;

import br.ufpb.concessionaria.models.Usuario;
import br.ufpb.concessionaria.models.Vendedor;

import br.ufpb.concessionaria.repository.VeiculoRepository;
import br.ufpb.concessionaria.repository.VendaRepository;
import br.ufpb.concessionaria.repository.VendedorRepository;
import org.springframework.stereotype.Service;

@Service
public class Load {


    VeiculoRepository veiculoRepository;

    VendaRepository vendaRepository;

    VendedorRepository vendedorRepository;



    public void carregarCliente(){
        Usuario usuario = new Usuario();

        cliente.setNome("Exemplo da Silva");
        usuario.setCpf("399-498-628-39");
        usuario.setEmail("exemplo@gmail.com");
        usuario.setCnh("Nome");
        usuario.setSenha("123");
        usuario.setTelefone("(83) 9 1234-1234");

        usuarioRepository.save(usuario);

    }

    public void carregarMedico(){
        Medico medico = new Medico();

        medico.setCargo("teste");
        medico.setCrm("123.123.123.123");
        medico.setName("Carlos");

        medicoRepository.save(medico);
    }

    public void carregarConsulta(){
        Consulta consulta = new Consulta();

        consulta.setObservacao("teste");
        consulta.setStatus("Realizado");

        consultaRepository.save(consulta);
    }

    public void carregarProcedimento(){
        Procedimento procedimento = new Procedimento();

        procedimento.setDescricao("teste");
        procedimento.setNome("teste");
        procedimento.setValor((long) 150);
        procedimento.setTipo("Exame");

        procedimentoRepository.save(procedimento);

    }

    public void carregarOrcamento(){
        Orcamento orcamento = new Orcamento();

        orcamento.setObservacao("teste");
        orcamento.setPagamento("Cartao");
        orcamento.setValotTotal((long) 200);
        orcamento.setMedico("teste");

        orcamentoRepository.save(orcamento);
    }


    public void carregar(){
        carregarConsulta();
        carregarMedico();
        carregarOrcamento();
        carregarProcedimento();
        carregarUsuarios();
    }
}