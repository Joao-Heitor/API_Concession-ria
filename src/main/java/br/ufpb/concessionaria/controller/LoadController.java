package br.ufpb.concessionaria.controller;

import br.ufpb.concessionaria.load.Load;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadController {
    private final Load load;

    public LoadController(Load load) {
        this.load = load;
    }

    @GetMapping
    public void carregar() {
        load.carregarCliente();
    }

}