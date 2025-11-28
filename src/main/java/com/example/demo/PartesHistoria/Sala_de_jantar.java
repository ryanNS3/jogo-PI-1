package com.example.demo.PartesHistoria;

import java.util.Scanner;

public class Sala_de_jantar {

    public boolean Iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------- SALA DE JANTAR ---------------");
        System.out.println("A mesa está parcialmente posta, como se o jantar tivesse sido interrompido.");
        System.out.println("Há pratos virados, talheres fora do lugar e comida ainda quente...");
        System.out.println("No centro da mesa há um pano escuro dobrado com um cheiro estranho.");
        System.out.println("----------------------------------------------\n");

        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Cheirar o pano");
        System.out.println("2 - Evitar o pano e seguir investigando");
        System.out.print("Escolha: ");

        int escolha = sc.nextInt();
        System.out.println();

        switch (escolha) {
            case 1:
                System.out.println("Você leva o pano ao rosto e inspira...");
                System.out.println("O cheiro doce invade seu nariz.");
                System.out.println("Sua visão começa a embaralhar...");
                System.out.println("Seu corpo fica pesado...");
                System.out.println("\n☠️ Você foi envenenado. Final alternativo: Morte súbita.");

                // FINAL IMEDIATO DO JOGO
                System.exit(0);
                return false;

            case 2:
                System.out.println("Você evita o pano instintivamente.");
                System.out.println("Algo no cheiro te deixa desconfortável.");
                System.out.println("Você continua investigando o ambiente com cautela.");
                System.out.println("\n✔️ Você evitou ser envenenado.");
                return true; // talvez no futuro vire pista

            default:
                System.out.println("Opção inválida. Você perde a chance de interagir com o pano.");
                return false;
        }
    }
}
