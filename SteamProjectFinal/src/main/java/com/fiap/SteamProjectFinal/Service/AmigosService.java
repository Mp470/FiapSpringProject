package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Amigos;

import java.util.List;

public interface AmigosService {

    public Amigos insert(Amigos amigos);

    public List<Amigos> list();
}
