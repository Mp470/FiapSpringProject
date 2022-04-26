package com.fiap.SteamProjectFinal.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Amigos")
@Data
public class Amigos {
    public Amigos(String _id, String avatar, String nome, Boolean isOnline, String playing, Date createdAt) {
        super();
        this._id = _id;
        this.avatar = avatar;
        this.nome = nome;
        this.isOnline = isOnline;
        this.playing = playing;
        this.createdAt = createdAt;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public String getPlaying() {
        return playing;
    }

    public void setPlaying(String playing) {
        this.playing = playing;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Id
    private String _id;

    private String avatar;

    private String nome;

    private Boolean isOnline;

    private String playing;

    private Date createdAt;

}
