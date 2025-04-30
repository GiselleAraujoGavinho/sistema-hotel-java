package com.senai.hotelaria;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("#############");
        System.out.println("Informações do cliente");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
    }

}
