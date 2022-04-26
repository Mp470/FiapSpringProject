package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Loja;
import com.fiap.SteamProjectFinal.Repository.JogosRepository;
import com.fiap.SteamProjectFinal.Repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaServiceImpl implements LojaService{
    @Autowired
    private LojaRepository lojaRepository;

    @Override
    public Loja insert(Loja loja) {
        return this.lojaRepository.save(loja);
    }

    @Override
    public List<Loja> list() {
        return this.lojaRepository.findAll();
    }
}
