package com.senai.infoa.loja_de_joias.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="usuario")
public class usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column (name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "cpf")
    private int cpf;


    public usuario () {}


    public usuario (Integer id, String nome, String email, String senha, int cpf){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    




}
