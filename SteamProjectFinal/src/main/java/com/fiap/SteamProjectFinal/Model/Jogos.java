package com.fiap.SteamProjectFinal.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Jogos")
@Data
public class Jogos {
    public Jogos(String _id, String titulo, String capa, String[] photos, Double preco, Date dt_lancamento, String[] generos, String descricao, Date createdAt) {
        super();
        this._id = _id;
        this.titulo = titulo;
        this.capa = capa;
        this.photos = photos;
        this.preco = preco;
        this.dt_lancamento = dt_lancamento;
        this.generos = generos;
        this.descricao = descricao;
        this.createdAt = createdAt;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String[] getPhotos() {
        return photos;
    }

    public void setPhotos(String[] photos) {
        this.photos = photos;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Date getDt_lancamento() {
        return dt_lancamento;
    }

    public void setDt_lancamento(Date dt_lancamento) {
        this.dt_lancamento = dt_lancamento;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Id
    private String _id;

    private String titulo;

    private String capa;

    private String[] photos;

    private Double preco;

    private Date dt_lancamento;

    private String[] generos;

    private String descricao;

    private Date createdAt;
}
