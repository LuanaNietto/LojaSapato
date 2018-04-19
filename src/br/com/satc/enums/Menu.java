/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.enums;

import br.com.satc.objeto.Produtos;

/**
 *
 * @author luana.159917
 */
public enum Menu {
    CadastrarCliente(1),
    CadastrarProdutos(2),
    CadastrarVendas(3),
    ConsultarCliente(4),
    ConsultarProdutos(5),
    ConsultarVendas(6);
     
    private int opcaoEscolha;

    private Menu(int opcaoEscolha) {
        this.opcaoEscolha = opcaoEscolha;
    }

    public static Menu getCadastrarCliente() {
        return CadastrarCliente;
    }

    public static Menu getCadastrarProdutos() {
        return CadastrarProdutos;
    }

    public static Menu getCadastrarVendas() {
        return CadastrarVendas;
    }

    public static Menu getConsultarCliente() {
        return ConsultarCliente;
    }

    public static Menu getConsultarProdutos() {
        return ConsultarProdutos;
    }

    public static Menu getConsultarVendas() {
        return ConsultarVendas;
    }

    public int getOpcaoEscolha() {
        return opcaoEscolha;
    }
   

    @Override
    public String toString() {
        return "Menu{" + "opcaoEscolha=" + opcaoEscolha + '}';
    }

    public void add(Produtos produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
