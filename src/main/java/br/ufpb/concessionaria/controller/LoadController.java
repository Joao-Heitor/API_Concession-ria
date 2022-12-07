package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.load.Load;
import br.ufpb.concessionaria.load.LoadAdm;
import br.ufpb.concessionaria.models.Vendedor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadController {
    private final Load load;
    private final LoadAdm loadAdm;

    public LoadController(Load load, LoadAdm loadAdm) {
        this.load = load;
        this.loadAdm = loadAdm;
    }

    @GetMapping("/ADM")
    public Vendedor carregarADM(){
        loadAdm.carregarADM();
        return loadAdm.getADM();
    }
    @GetMapping("/Dados")
    public void carregar() {
        load.carregarCliente();
        load.carregarVendedor();
        load.carregarVeiculo();
    }

}