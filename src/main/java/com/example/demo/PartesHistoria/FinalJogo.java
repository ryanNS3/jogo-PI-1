package com.example.demo.PartesHistoria;

public class FinalJogo {

    public static void finalizar(boolean taca, boolean pano, boolean pegadas) {

        System.out.println("\n====================== FINAL DA INVESTIGAÇÃO ======================\n");

        if (!taca && !pano && !pegadas) {
            System.out.println("Você tentou resolver o caso... mas não reuniu pistas suficientes.");
            System.out.println("O assassino permanece à solta...");
            System.out.println("Final: Caso Fracassado");
            return;
        }

        if (taca && pano && pegadas) {
            System.out.println("Com todas as pistas em mãos, você reconstrói o crime:");
            System.out.println("\n- A taça com pó revela que a vítima foi envenenada.");
            System.out.println("- O pano com sangue e a digital mostra que houve contato direto com a vítima.");
            System.out.println("- As pegadas levando ao muro indicam a fuga apressada do assassino.");
            System.out.println("\nVocê percebe que tudo aponta para a mesma pessoa...");
            System.out.println("O mordomo — jovem, atlético, e o único que sabia da reunião íntima.");
            System.out.println("\nVocê contacta a polícia, que captura o culpado em poucas horas.");
            System.out.println("Final: Caso Resolvido com Sucesso!");
            return;
        }

        // COMBINAÇÕES PARCIAIS
        if (taca && pano) {
            System.out.println("Você descobriu que houve envenenamento e luta.");
            System.out.println("Mas sem entender a rota de fuga, o assassino escapa.");
            System.out.println("Final: Meio Sucesso — assassino não capturado.");
            return;
        }

        if (taca && pegadas) {
            System.out.println("Você sabe que houve veneno e uma fuga, mas falta a digital crucial.");
            System.out.println("Final: Caso Indeterminado — faltaram provas.");
            return;
        }

        if (pano && pegadas) {
            System.out.println("Você sabe que houve luta e uma fuga arriscada...");
            System.out.println("Mas não descobriu o método da morte.");
            System.out.println("Final: Falha — causa da morte desconhecida.");
            return;
        }

        System.out.println("Você encontrou apenas uma pista, mas isso não resolve o mistério.");
        System.out.println("Final: Caso Inconclusivo.");
    }
}
