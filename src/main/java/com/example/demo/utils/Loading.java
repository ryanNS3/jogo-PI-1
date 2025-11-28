package com.example.demo.utils;

public class Loading {
    LimparConsole limpar = new LimparConsole();
    public void Iniciar(){
        try {
            for (int i = 0; i < 10; i++) {
                String pontos = ".".repeat(i % 6);
                
                System.out.print("\rCarregando" + pontos + "   ");
                Thread.sleep(400);
            }
            limpar.limparConsole();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
