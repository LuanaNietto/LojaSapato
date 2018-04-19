/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

/**
 *
 * @author luana.159917
 */
public class Produtos {
    private String nome;
    private String descricao;
    private char status;
    private int id;

    public Produtos(String nome, String descricao, char status, int id) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produtos{" + "nome=" + nome + ", descricao=" + descricao + ", status=" + status + ", id=" + id + '}';
    }

    
    }

    