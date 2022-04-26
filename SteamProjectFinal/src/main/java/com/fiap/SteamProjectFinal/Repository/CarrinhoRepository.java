package com.fiap.SteamProjectFinal.Repository;

import com.fiap.SteamProjectFinal.Model.Carrinho;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarrinhoRepository extends MongoRepository<Carrinho, String> {
}
