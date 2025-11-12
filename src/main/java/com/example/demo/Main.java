package com.example.demo;

import com.example.demo.PartesHistoria.Cozinha;
import com.example.demo.PartesHistoria.Varanda;
import com.example.demo.PartesHistoria.Quarto;

public class Main {
    public static void main(String[] args) {
        Cozinha teste = new Cozinha();
        Varanda varanda = new Varanda();
        Quarto quarto = new Quarto();

        teste.Iniciar();
        varanda.Iniciar();
        quarto.Iniciar();
    }
}
