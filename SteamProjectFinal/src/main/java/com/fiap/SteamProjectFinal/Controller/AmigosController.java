package com.fiap.SteamProjectFinal.Controller;

import com.fiap.SteamProjectFinal.Model.Amigos;
import com.fiap.SteamProjectFinal.Service.AmigosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Amigos")
public class AmigosController {
    @Autowired
    private AmigosService amigosService;

    @GetMapping
    public List<Amigos> list() {
        return this.amigosService.list();
    }

    @PostMapping
    public Amigos insert(@RequestBody Amigos amigos)
    {
        return this.amigosService.insert(amigos);
    }

}
