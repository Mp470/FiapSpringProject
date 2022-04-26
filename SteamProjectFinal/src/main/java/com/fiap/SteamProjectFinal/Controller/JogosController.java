package com.fiap.SteamProjectFinal.Controller;

import com.fiap.SteamProjectFinal.Model.Jogos;
import com.fiap.SteamProjectFinal.Service.JogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Jogos")
public class JogosController {
    @Autowired
    private JogosService jogosService;

    @GetMapping
    public List<Jogos> list() {
        return this.jogosService.list();
    }

    @PostMapping
    public Jogos insert(@RequestBody Jogos jogos)
    {
        return this.jogosService.insert(jogos);
    }
}
