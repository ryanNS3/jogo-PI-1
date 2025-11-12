package com.example.demo.PartesHistoria;

import com.example.demo.utils.LimparConsole;
import com.example.demo.utils.Loading;
import java.util.Scanner;

public class Varanda {
    Loading loading = new Loading();

    public void Iniciar() {
        loading.Iniciar();
        LimparConsole limpar = new LimparConsole();
        limpar.limparConsole();

        // ------------------------------ NARRATIVA INICIAL ------------------------------
        System.out.println("Você abre a porta e sai para a varanda...");
        System.out.println("O ar frio da noite toca seu rosto. O ambiente está silencioso — silencioso demais.");
        System.out.println("O som distante do vento corta a escuridão e você sente um arrepio percorrer sua espinha.");
        System.out.println("\nA varanda é ampla, cercada por um muro baixo e com uma bela vista do jardim lá embaixo.");
        System.out.println("No entanto, algo chama sua atenção imediatamente: há pegadas úmidas no chão de pedra.");
        System.out.println("Elas parecem recentes e seguem até o muro — mas desaparecem ali, de forma abrupta...");
        System.out.println("\nVocê se aproxima, observando cada detalhe. Seria possível que o assassino tivesse pulado?");
        System.out.println("A varanda é alta. Uma queda daqui machucaria uma pessoa comum, a menos que fosse alguém jovem e ágil...");
        System.out.println("Ou talvez o assassino tivesse acesso a uma escada ou rota de fuga próxima.");
        System.out.println("O mistério se aprofunda ainda mais.");
        System.out.println("---------------------------------------------------------------------------------------");
        // ----------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        boolean examinouPegadas = false;
        boolean examinouMuro = false;
        boolean examinouChao = false;
        boolean sair = false;

        while (!sair) {
            System.out.println("\nO que você deseja examinar?");
            System.out.println("1 - As pegadas");
            System.out.println("2 - O muro");
            System.out.println("3 - O chão da varanda");
            System.out.println("4 - Sair da varanda");
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            limpar.limparConsole();

            switch (escolha) {
                case "1":
                    if (!examinouPegadas) {
                        System.out.println("Você se agacha e observa as pegadas mais de perto...");
                        System.out.println("Elas parecem ser de um sapato masculino, tamanho grande.");
                        System.out.println("O curioso é que as marcas se tornam mais leves conforme se aproximam do muro —");
                        System.out.println("como se o indivíduo tivesse ganhado impulso para pular.");
                        System.out.println("Pista adquirida: 'Pegadas que terminam no muro'");
                        examinouPegadas = true;
                    } else {
                        System.out.println("Você já examinou as pegadas. Elas continuam levando até o muro e desaparecendo ali.");
                    }
                    break;

                case "2":
                    if (!examinouMuro) {
                        System.out.println("Você se aproxima do muro e o toca. Há pequenas marcas de sujeira na borda superior.");
                        System.out.println("Sinais claros de que alguém apoiou as mãos ali recentemente.");
                        System.out.println("A queda parece alta — cerca de quatro metros. Um salto perigoso para a maioria.");
                        System.out.println("Mas há uma possibilidade: o assassino pode ter usado uma escada ou sido alguém jovem e atlético.");
                        System.out.println("Pista adquirida: 'Marcas de apoio no muro da varanda'");
                        examinouMuro = true;
                    } else {
                        System.out.println("Você já observou o muro. As marcas permanecem lá, silenciosas e intrigantes.");
                    }
                    break;

                case "3":
                    if (!examinouChao) {
                        System.out.println("Você examina o chão da varanda e percebe pequenas manchas de barro próximas à entrada.");
                        System.out.println("Parece que alguém entrou apressado — talvez vindo do jardim, talvez fugindo dele.");
                        System.out.println("As pegadas internas e externas parecem ter sido deixadas pela mesma pessoa.");
                        System.out.println("Pista adquirida: 'Barro recente no chão da varanda'");
                        examinouChao = true;
                    } else {
                        System.out.println("Você já examinou o chão. Nada novo chama sua atenção.");
                    }
                    break;

                case "4":
                    System.out.println("Você decide deixar a varanda e retornar para dentro da casa...");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Escolha um número entre 1 e 4.");
                    break;
            }
        }

        System.out.println("\nVocê se afasta da varanda, levando consigo novas hipóteses sobre a fuga do assassino...");
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
