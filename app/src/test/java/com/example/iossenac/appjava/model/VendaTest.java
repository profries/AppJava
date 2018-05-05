package com.example.iossenac.appjava.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendaTest {
    Venda venda;

    @Before
    public void setup(){
        Produto produto1, produto2;
        venda = new Venda();
        produto1 = new Produto("camisa",30);
        produto2 = new Produto("calca",60);
        venda.addProduto(produto1);
        venda.addProduto(produto2);
    }

    @Test
    public void addProduto() {
        int valorEsperado = 3;

        Produto produto = new Produto("tenis",199);
        venda.addProduto(produto);

        assertEquals(3  , venda.getQuantidade(), 0);

    }

    @Test
    public void calcularTotalOK() {
        double valorEsperado = 110;

        venda.setFrete(20);

        double valorFinal = venda.calcularTotal();

        assertEquals(valorEsperado, valorFinal, 0);

    }

    @Test
    public void calcularTotalComFreteErrado() {

        try{
            venda.setFrete(-10);
            fail("Frete não pode receber número negativo");
        } catch (IllegalArgumentException ex){
            return;
        }

    }
}