package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Loja;

import java.util.List;

public interface LojaService {
    public Loja insert(Loja loja);

    public List<Loja> list();
}
