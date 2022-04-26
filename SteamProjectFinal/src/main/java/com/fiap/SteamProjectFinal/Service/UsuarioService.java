package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario insert(Usuario usuario);

    public List<Usuario> list();
}
