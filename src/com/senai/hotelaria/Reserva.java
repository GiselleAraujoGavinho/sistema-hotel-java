package com.senai.hotelaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate dataTermino) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public void exibirInformacoes() {
        System.out.println("Informações da reserva");
        cliente.exibirInformacoes();
        quarto.exibirInformacoes();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Início: " + formatters.format(this.dataInicio));
        System.out.println("Fim: " + formatters.format(this.dataTermino));
    }

}
