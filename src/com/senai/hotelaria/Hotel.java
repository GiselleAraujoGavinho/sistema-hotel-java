package com.senai.hotelaria;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Hotel");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);

        for(Quarto quarto : quartos) {
            quarto.exibirInformacoes();
        }

    }

}
