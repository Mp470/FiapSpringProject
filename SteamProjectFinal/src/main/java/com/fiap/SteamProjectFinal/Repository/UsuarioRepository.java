package com.fiap.SteamProjectFinal.Repository;

import com.fiap.SteamProjectFinal.Model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
