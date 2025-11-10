package com.example.demo.PartesHistoria;

import com.example.demo.utils.LimparConsole;
import com.example.demo.utils.Loading;
import java.util.Scanner;

public class Cozinha {
    Loading loading = new Loading();

    public void Iniciar() {
        loading.Iniciar();
        LimparConsole limpar = new LimparConsole();
        limpar.limparConsole();
        System.out.println("Você entra na cozinha e se depara com o cheiro de algo delicioso no ar...");

        // ------------------------------ NARRATIVA APRIMORADA ------------------------------
        System.out.println("\nO ambiente está bagunçado, como se alguém tivesse saído apressadamente.");
        System.out.println("Panelas ainda mornas repousam sobre o fogão, e um leve aroma de vinho toma conta do ar.");
        System.out.println("Sobre a mesa central, há uma garrafa de vinho aberta e duas taças...");
        System.out.println("Uma delas está limpa — reluzente, intacta.");
        System.out.println("Mas a outra chama sua atenção: há um pó esbranquiçado acumulado no fundo, quase imperceptível.");
        System.out.println("\nVocê se aproxima, observa com atenção e percebe que o pó parece ter se dissolvido parcialmente no líquido restante.");
        System.out.println("A hipótese mais provável surge à sua mente: envenenamento.");
        System.out.println("Se isso for verdade, o velho milionário pode ter ingerido o veneno durante o jantar.");
        System.out.println("\nEnquanto analisa a cena, algo lhe parece fora do lugar — há marcas de passos recentes no chão de mármore, indo em direção à porta da sala de jantar.");
        System.out.println("O mistério se aprofunda...");
        System.out.println("---------------------------------------------------------------------------------------");
        // ----------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        boolean pegouGarrafa = false;
        boolean pegouTacaLimpa = false;
        boolean pegouTacaComPo = false;
        boolean sair = false;

        // Loop de interação com os itens
        while (!sair) {
            System.out.println("\nO que você deseja examinar?");
            System.out.println("1 - Garrafa de vinho");
            System.out.println("2 - Taça limpa");
            System.out.println("3 - Taça com pó esbranquiçado");
            System.out.println("4 - Sair da cozinha");
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            limpar.limparConsole();

            switch (escolha) {
                case "1":
                    if (!pegouGarrafa) {
                        System.out.println("Você examina a garrafa de vinho. Está quase vazia e ainda há gotas escorrendo pelo gargalo.");
                        System.out.println("O rótulo indica uma safra caríssima — certamente algo reservado para uma ocasião especial.");
                        System.out.println("Você anota mentalmente o nome do vinho para futura análise.");
                        pegouGarrafa = true;
                    } else {
                        System.out.println("Você já analisou a garrafa. Nada mais de relevante nela.");
                    }
                    break;

                case "2":
                    if (!pegouTacaLimpa) {
                        System.out.println("Você pega a taça limpa e observa contra a luz. Nenhum resíduo, nenhuma marca de lábios.");
                        System.out.println("Parece que alguém preparou duas taças, mas apenas uma foi usada.");
                        System.out.println("Isso sugere que o anfitrião esperava companhia.");
                        pegouTacaLimpa = true;
                    } else {
                        System.out.println("Você já examinou a taça limpa. Ela permanece impecável.");
                    }
                    break;

                case "3":
                    if (!pegouTacaComPo) {
                        System.out.println("Ao observar a taça suja, você percebe um pó branco no fundo — quase imperceptível.");
                        System.out.println("Você toca levemente o interior e sente um leve ardor nos dedos. Isso não é normal...");
                        System.out.println("Essa substância pode ser a chave para o mistério. Você a coleta cuidadosamente em um pequeno frasco.");
                        System.out.println("Pista adquirida: 'Taça com resíduo suspeito'");
                        pegouTacaComPo = true;
                    } else {
                        System.out.println("Você já coletou o resíduo da taça. Não há mais nada a fazer aqui.");
                    }
                    break;

                case "4":
                    System.out.println("Você decide deixar a cozinha e seguir para o próximo cômodo...");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Escolha um número entre 1 e 4.");
                    break;
            }
        }

        System.out.println("\nVocê sai da cozinha, levando consigo as lembranças e suspeitas do que viu ali...");
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
