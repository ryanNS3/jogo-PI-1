package org.example;

import java.util.Scanner;

public class Sala_de_jantar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  CENA
        System.out.println("--------------- SALA DE JANTAR ---------------");
        System.out.println("A mesa está parcialmente posta, como se o jantar tivesse sido interrompido.");
        System.out.println("Há pratos virados, talheres fora do lugar e restos de comida ainda quentes...");
        System.out.println("No centro da mesa, há um pano dobrado com um cheiro estranho.");
        System.out.println("Sua textura escura contrasta com a toalha branca, chamando sua atenção.");
        System.out.println("----------------------------------------------\n");

        //  ESCOLHA
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Cheirar o pano");
        System.out.println("2 - Ignorar o pano e continuar investigando");
        System.out.print("Escolha: ");

        int escolha = sc.nextInt();
        System.out.println();

        // RESULTADO DA ESCOLHA
        switch (escolha) {
            case 1:
                System.out.println("Você leva o pano até o rosto e inspira...");
                System.out.println("Um cheiro doce invade seu nariz.");
                System.out.println("Sua visão começa a embaralhar...");
                System.out.println("Suas pernas tremem...");
                System.out.println("\n☠️ Você foi envenenado. Final alternativo: Morte súbita.");
                break;

            case 2:
                System.out.println("Você decide não tocar no pano.");
                System.out.println("Embora estranho, algo te diz que seria perigoso.");
                System.out.println("Você continua investigando a sala atentamente...");
                System.out.println("\n✔️ Você evitou um perigo mortal.");
                break;

            default:
                System.out.println("Opção inválida! A investigação continua, mas você perdeu a chance de interagir com o objeto.");
        }

        sc.close();
    }
}
