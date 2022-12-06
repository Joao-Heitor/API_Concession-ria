package br.ufpb.concessionaria.load;

import br.ufpb.concessionaria.models.Vendedor;
import br.ufpb.concessionaria.repository.ClienteRepository;
import br.ufpb.concessionaria.repository.VendedorRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoadAdm {
    private VendedorRepository vendedorRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public LoadAdm(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    public void carregarADM() {
        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Adm");
        vendedor.setCpf("CPF do adm");
        vendedor.setEmail("adm@adm.com");
        vendedor.setSalario("adm");
        vendedor.setUsername("admin");
        vendedor.setPassword(bCryptPasswordEncoder.encode("admin123"));
        vendedorRepository.save(vendedor);
    }
}
