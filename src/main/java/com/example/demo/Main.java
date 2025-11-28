package com.example.demo;

import com.example.demo.PartesHistoria.*;

import java.util.Scanner;

public class Main {

    public static boolean pistaTaca = false;
    public static boolean pistaPano = false;
    public static boolean pistaPegadas = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cozinha cozinha = new Cozinha();
        Quarto quarto = new Quarto();
        Varanda varanda = new Varanda();
        Sala_de_jantar sala = new Sala_de_jantar();

        boolean sair = false;

        while (!sair) {
            System.out.println("============== MENU PRINCIPAL ==============");
            System.out.println("1 - Ir para a Cozinha");
            System.out.println("2 - Ir para o Quarto");
            System.out.println("3 - Ir para a Varanda");
            System.out.println("4 - Ir para a Sala de Jantar");
            System.out.println("5 - Resolver o Mistério (Final)");
            System.out.println("6 - Sair");
            System.out.println("============================================");
            System.out.print("Escolha uma opção: ");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    pistaTaca = cozinha.Iniciar();
                    break;

                case "2":
                    pistaPano = quarto.Iniciar();
                    break;

                case "3":
                    pistaPegadas = varanda.Iniciar();
                    break;

                case "4":
                    sala.Iniciar();
                    break;
                case "5":
                    FinalJogo.finalizar(pistaTaca, pistaPano, pistaPegadas);
                    break;
                case "6":
                    sair = true;
                    System.out.println("Saindo da investigação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
