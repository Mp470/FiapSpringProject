package com.fiap.SteamProjectFinal.Service;

import com.fiap.SteamProjectFinal.Model.Amigos;
import com.fiap.SteamProjectFinal.Model.Carrinho;
import com.fiap.SteamProjectFinal.Repository.AmigosRepository;
import com.fiap.SteamProjectFinal.Repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoServiceImpl implements CarrinhoService{
    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Override
    public Carrinho insert(Carrinho carrinho) {
        return this.carrinhoRepository.save(carrinho);
    }

    @Override
    public List<Carrinho> list() {
        return this.carrinhoRepository.findAll();
    }
}
