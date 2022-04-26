package com.fiap.SteamProjectFinal.Controller;

import com.fiap.SteamProjectFinal.Model.Usuario;
import com.fiap.SteamProjectFinal.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> list() {
        return this.usuarioService.list();
    }

    @PostMapping
    public Usuario insert(@RequestBody Usuario loja)
    {
        return this.usuarioService.insert(loja);
    }
}
