package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Usuario;
import com.fiap.SteamProjectFinal.Repository.LojaRepository;
import com.fiap.SteamProjectFinal.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository UsuarioRepository;

    @Override
    public Usuario insert(Usuario usuario) {
        return this.UsuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return this.UsuarioRepository.findAll();
    }
}
