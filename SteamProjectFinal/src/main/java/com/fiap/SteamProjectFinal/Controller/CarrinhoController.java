package com.fiap.SteamProjectFinal.Controller;

import com.fiap.SteamProjectFinal.Model.Carrinho;
import com.fiap.SteamProjectFinal.Service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Carrinho")
public class CarrinhoController {
    @Autowired
    private CarrinhoService carrinhoService;

    @GetMapping
    public List<Carrinho> list() {
        return this.carrinhoService.list();
    }

    @PostMapping
    public Carrinho insert(@RequestBody Carrinho carrinho)
    {
        return this.carrinhoService.insert(carrinho);
    }
}
