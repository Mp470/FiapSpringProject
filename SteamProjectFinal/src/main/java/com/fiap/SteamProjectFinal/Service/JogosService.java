package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Jogos;

import java.util.List;

public interface JogosService {
    public Jogos insert(Jogos jogos);

    public List<Jogos> list();
}
