package com.fiap.SteamProjectFinal.Controller;

import com.fiap.SteamProjectFinal.Model.Loja;
import com.fiap.SteamProjectFinal.Service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Loja")
public class LojaController {
    @Autowired
    private LojaService lojaService;

    @GetMapping
    public List<Loja> list() {
        return this.lojaService.list();
    }

    @PostMapping
    public Loja insert(@RequestBody Loja loja)
    {
        return this.lojaService.insert(loja);
    }
}
