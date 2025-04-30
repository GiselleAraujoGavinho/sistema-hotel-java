package com.senai.hotelaria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o nome do hotel:");
        String nomeHotel = teclado.nextLine();

        System.out.println("Digite o endereço do hotel:");
        String enderecoHotel = teclado.nextLine();

        Hotel hotel = new Hotel(nomeHotel, enderecoHotel);


        System.out.println("Digite o número do quarto: ");
        int numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o tipo do quarto: ");
        String tipo = teclado.nextLine();


        Quarto quarto = new Quarto(numero, tipo);


        hotel.adicionarQuarto(quarto);
        hotel.exibirInformacoes();


        System.out.println("Digite o nome do cliente:");
        String nomeCliente = teclado.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpfCliente = teclado.nextLine();

        System.out.println("Digite o e-mail do cliente:");
        String emailCliente = teclado.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, emailCliente);


        Reserva r1 = new Reserva(
                cliente,
                quarto,
                LocalDate.now(),
                LocalDate.now().plusDays(3)
        );

        r1.exibirInformacoes();

        teclado.close();
    }
}
