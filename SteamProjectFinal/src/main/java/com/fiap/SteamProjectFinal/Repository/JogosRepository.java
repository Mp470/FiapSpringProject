package com.fiap.SteamProjectFinal.Repository;

import com.fiap.SteamProjectFinal.Model.Jogos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JogosRepository extends MongoRepository<Jogos, String> {
}
