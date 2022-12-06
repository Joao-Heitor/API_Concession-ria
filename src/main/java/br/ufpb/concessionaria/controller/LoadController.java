package br.ufpb.concessionaria.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpb.concessionaria.load.Load;



@CrossOrigin("*")
@RestController
@RequestMapping("/load")
public class LoadController {
    private Load load;

    public LoadController() {
    }

    @GetMapping
    public void carregar(){
        load.carregar();

    }

}