package br.com.henriqueandrew.exercicio2;

// @author Henrique Andrew da Silva
import java.util.ArrayList;

public class ControleCorridas {

    public void novaCorrida() {

        System.out.println("======CORRIDA DE MOTOCICLETAS=====\n\n");

        System.out.println("Dado a largada!!!\n\n");

        //int pontuacao[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Corrida competidor1 = new Corrida("Piloto 1");
        Corrida competidor2 = new Corrida("Piloto 2");
        Corrida competidor3 = new Corrida("Piloto 3");
        Corrida competidor4 = new Corrida("Piloto 4");
        Corrida competidor5 = new Corrida("Piloto 5");
        Corrida competidor6 = new Corrida("Piloto 6");
        Corrida competidor7 = new Corrida("Piloto 7");
        Corrida competidor8 = new Corrida("Piloto 8");
        Corrida competidor9 = new Corrida("Piloto 9");
        Corrida competidor10 = new Corrida("Piloto 10");

        try {
            competidor1.competidor.join();
            competidor2.competidor.join();
            competidor3.competidor.join();
            competidor4.competidor.join();
            competidor5.competidor.join();
            competidor6.competidor.join();
            competidor7.competidor.join();
            competidor8.competidor.join();
            competidor9.competidor.join();
            competidor10.competidor.join();

        } catch (InterruptedException exc) {
            System.out.println("Corrida interrompida");

        }

        System.out.println("\n>>> Corrida encerrada!!!");
        System.out.println(
                "\n\n====Classificação Final da Corrida====");

        //Corrida classificacao = new Corrida();
        System.out.println(Corrida.retornaClassificacao());
    }
}

