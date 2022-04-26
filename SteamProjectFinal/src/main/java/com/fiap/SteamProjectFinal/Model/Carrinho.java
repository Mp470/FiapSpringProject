package com.fiap.SteamProjectFinal.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Carrinho")
@Data
public class Carrinho {
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String[] getJogos() {
        return jogos;
    }

    public void setJogos(String[] jogos) {
        this.jogos = jogos;
    }

    public Carrinho(String _id, String userId, Float total, Date createdAt, String[] jogos) {
        super();
        this._id = _id;
        this.userId = userId;
        this.total = total;
        this.createdAt = createdAt;
        this.jogos = jogos;
    }

    @Id
    private String _id;

    private String userId;

    private Float total;

    private Date createdAt;

    private String[] jogos;


}
