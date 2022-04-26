package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Jogos;
import com.fiap.SteamProjectFinal.Repository.CarrinhoRepository;
import com.fiap.SteamProjectFinal.Repository.JogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogosServiceImpl implements JogosService{
    @Autowired
    private JogosRepository jogosRepository;

    @Override
    public Jogos insert(Jogos jogos) {
        return this.jogosRepository.save(jogos);
    }

    @Override
    public List<Jogos> list() {
        return this.jogosRepository.findAll();
    }
}
