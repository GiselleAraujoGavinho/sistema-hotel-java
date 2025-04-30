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


        Cliente cliente = new Cliente(
                "Thiago",
                "999.999.999-99",
                "thiago@hotmail.com"
        );


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
