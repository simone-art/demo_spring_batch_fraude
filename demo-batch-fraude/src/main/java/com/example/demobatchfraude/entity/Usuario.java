package com.example.demobatchfraude.entity;


import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name= "Fraude")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;

    @Column
    private String nome;

    @Column
    private String sobreNome;

    @Column
    private Boolean usuarioFraudulento;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Boolean getUsuarioFraudulento() {
        return usuarioFraudulento;
    }

    public void setUsuarioFraudulento(Boolean usuarioFraudulento) {
        this.usuarioFraudulento = usuarioFraudulento;
    }

    public Usuario() {
    }

    public Usuario(long codigo, String nome, String sobreNome, Boolean usuarioFraudulento) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.usuarioFraudulento = usuarioFraudulento;
    }
}
