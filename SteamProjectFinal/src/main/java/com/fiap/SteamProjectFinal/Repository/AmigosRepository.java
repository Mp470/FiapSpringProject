package com.fiap.SteamProjectFinal.Repository;

import com.fiap.SteamProjectFinal.Model.Amigos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AmigosRepository extends MongoRepository<Amigos, String> {
}
