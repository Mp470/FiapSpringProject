package com.fiap.SteamProjectFinal.Repository;

import com.fiap.SteamProjectFinal.Model.Loja;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LojaRepository extends MongoRepository<Loja, String> {
}
