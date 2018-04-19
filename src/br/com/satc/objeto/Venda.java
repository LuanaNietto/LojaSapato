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
public class Venda {
   private String cliente;
   private char status;
   private String listProdutos;
   private float totalPagar;
   private int id;

    public Venda(String cliente, char status, String listProdutos, float totalPagar, int id) {
        this.cliente = cliente;
        this.status = status;
        this.listProdutos = listProdutos;
        this.totalPagar = totalPagar;
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getListProdutos() {
        return listProdutos;
    }

    public void setListProdutos(String listProdutos) {
        this.listProdutos = listProdutos;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Venda{" + "cliente=" + cliente + ", status=" + status + ", listProdutos=" + listProdutos + ", totalPagar=" + totalPagar + ", id=" + id + '}';
    }
}
    
