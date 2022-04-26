package com.fiap.SteamProjectFinal.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuario")
@Data
public class Usuario {
    public Usuario(String _id, String nome, String[] amigos, String[] jogosComprados) {
        super();
        this._id = _id;
        this.nome = nome;
        this.amigos = amigos;
        this.jogosComprados = jogosComprados;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getAmigos() {
        return amigos;
    }

    public void setAmigos(String[] amigos) {
        this.amigos = amigos;
    }

    public String[] getJogosComprados() {
        return jogosComprados;
    }

    public void setJogosComprados(String[] jogosComprados) {
        this.jogosComprados = jogosComprados;
    }

    @Id
    private String _id;

    private String nome;

    private String[] amigos;

    private String[] jogosComprados;
}
