package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Amigos;
import com.fiap.SteamProjectFinal.Repository.AmigosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmigosServiceImpl implements AmigosService{
    @Autowired
    private AmigosRepository amigosRepository;

    @Override
    public Amigos insert(Amigos amigos) {
        return this.amigosRepository.save(amigos);
    }

    @Override
    public List<Amigos> list() {
        return this.amigosRepository.findAll();
    }


}
