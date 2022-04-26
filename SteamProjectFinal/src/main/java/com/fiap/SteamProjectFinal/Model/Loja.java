package com.fiap.SteamProjectFinal.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Loja")
@Data
public class Loja {
    public Loja(String _id, String[] destaquesDaSemana, Date createdAt) {
        super();
        this._id = _id;
        this.destaquesDaSemana = destaquesDaSemana;
        this.createdAt = createdAt;
    }

    @Id
    private String _id;

    private String[] destaquesDaSemana;

    private Date createdAt;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String[] getDestaquesDaSemana() {
        return destaquesDaSemana;
    }

    public void setDestaquesDaSemana(String[] destaquesDaSemana) {
        this.destaquesDaSemana = destaquesDaSemana;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


}
