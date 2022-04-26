package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Carrinho;

import java.util.List;

public interface CarrinhoService {
    public Carrinho insert(Carrinho carrinho);

    public List<Carrinho> list();

}
