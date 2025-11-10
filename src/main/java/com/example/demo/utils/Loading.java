package com.example.demo.utils;

public class Loading {
    LimparConsole limpar = new LimparConsole();
    public void Iniciar(){
        try {
            for (int i = 0; i < 10; i++) { // número de ciclos do carregamento
                // Cria os pontos de forma dinâmica
                String pontos = ".".repeat(i % 6); // alterna de 0 a 5 pontos
                
                System.out.print("\rCarregando" + pontos + "   "); // sobrescreve a linha
                Thread.sleep(400); // pausa para ver o efeito
            }
            limpar.limparConsole();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pronto!");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Você entra na cozinha e se depara com o cheiro de algo delicioso no ar...");
    }
}
