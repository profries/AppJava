package com.example.iossenac.appjava.model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Produto> listaProdutos;
    private double frete;

    public Venda(){
        this.listaProdutos = new ArrayList<>();
        this.frete = 0;

    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        if(frete < 0) throw new IllegalArgumentException("Valor não pode ser menor que 0");
        this.frete = frete;
    }

    public int getQuantidade(){
        return this.listaProdutos.size();
    }

    public void addProduto(Produto p){
        this.listaProdutos.add(p);
    }

    public double calcularTotal(){
        double valorTotal = 0;

        for(Produto p: this.listaProdutos)
            valorTotal += p.getPreco();

        valorTotal += this.frete;

        return valorTotal;
    }

}
