package com.example.demo.PartesHistoria;

import com.example.demo.utils.LimparConsole;
import com.example.demo.utils.Loading;
import java.util.Scanner;

public class Quarto {
    Loading loading = new Loading();

    public void Iniciar() {
        loading.Iniciar();
        LimparConsole limpar = new LimparConsole();
        limpar.limparConsole();

        // ------------------------------ NARRATIVA INICIAL ------------------------------
        System.out.println("Você entra lentamente no quarto...");
        System.out.println("O ambiente está frio e silencioso. Uma energia pesada parece preencher o ar.");
        System.out.println("Um calafrio percorre sua espinha quando seus olhos se ajustam à penumbra.");
        System.out.println("\nHá um corpo deitado sobre a cama — pálido, imóvel, sem sinais de luta.");
        System.out.println("Ao lado, sobre a mesa de cabeceira, há um pano manchado, aparentemente comum...");
        System.out.println("Mas algo em sua textura e posição parece suspeito.");
        System.out.println("\nA mobília está em ordem, sem sinais de arrombamento ou desespero.");
        System.out.println("Talvez o assassinato tenha sido rápido, planejado — e cometido por alguém de confiança.");
        System.out.println("---------------------------------------------------------------------------------------");
        // ----------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        boolean examinouPano = false;
        boolean sair = false;

        while (!sair) {
            System.out.println("\nO que você deseja examinar?");
            System.out.println("1 - O corpo sobre a cama");
            System.out.println("2 - O pano na mesa de cabeceira");
            System.out.println("3 - O quarto ao redor");
            System.out.println("4 - Sair do quarto");
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            limpar.limparConsole();

            switch (escolha) {
                case "1":
                    System.out.println("Você se aproxima da cama...");
                    System.out.println("O corpo está frio, indicando que a morte ocorreu há algumas horas.");
                    System.out.println("Não há sinais visíveis de ferimentos ou luta.");
                    System.out.println("A expressão no rosto do homem é serena — quase como se tivesse adormecido.");
                    System.out.println("Mas um leve tom azulado nos lábios revela: ele pode ter sido asfixiado.");
                    break;

                case "2":
                    if (!examinouPano) {
                        System.out.println("Você pega o pano cuidadosamente e o examina sob a luz fraca do abajur.");
                        System.out.println("Há manchas de sangue seco nas bordas e marcas sutis de dedos.");
                        System.out.println("No verso, algo chama sua atenção: uma impressão digital parcial sobre o sangue.");
                        System.out.println("Pista adquirida: 'Pano com sangue e digital parcial'");
                        examinouPano = true;
                    } else {
                        System.out.println("Você já examinou o pano. As manchas e a digital continuam lá, inconfundíveis.");
                    }
                    break;

                case "3":
                    System.out.println("Você analisa o restante do quarto...");
                    System.out.println("Os móveis estão organizados, e a janela está entreaberta — o vento frio entra suavemente.");
                    System.out.println("Nada parece fora do lugar, exceto uma sensação incômoda de que alguém esteve aqui há pouco tempo.");
                    System.out.println("Talvez o assassino tenha saído por essa janela.");
                    break;

                case "4":
                    System.out.println("Você decide deixar o quarto e seguir sua investigação em outro cômodo...");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Escolha um número entre 1 e 4.");
                    break;
            }
        }

        System.out.println("\nVocê sai do quarto, levando consigo o peso da cena e a nova pista crucial.");
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
