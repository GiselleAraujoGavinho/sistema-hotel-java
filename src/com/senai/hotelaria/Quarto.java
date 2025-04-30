package com.senai.hotelaria;

public class Quarto {
    private int numero;
    private String tipo;
    private boolean ocupado;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = false;
    }

    public void ocuparQuarto() {
        this.ocupado = true;
    }

    public void desocuparQuarto() {
        this.ocupado = false;
    }

    public void exibirInformacoes(){
        System.out.println("#############");
        System.out.println("Informações do quarto");
        System.out.println("Número: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Ocupado: " + this.ocupado);
    }
}
