package br.com.henriqueandrew.exercicio2;

// @author Henrique Andrew da Silva
import java.util.ArrayList;

public class Corrida implements Runnable {

    static Thread competidor;
    public static ArrayList<Pilotos> colocacao = new ArrayList<Pilotos>();
    private static int col = 1;
    private static int pont = 10;
    int i = 1;

    public Corrida(String nome) {
        competidor = new Thread(this, nome);
        competidor.start();
    }

    //public Corrida() {
    //}
    public void run() {
        if (i == 1) {
            System.out.println(competidor.getName() + " inicia a corrida...");
            classificacao();
            i++;
        }

    }

    synchronized public void classificacao() {

        if (col < 10 && pont > 0) {

            //int col = 1;
            //int pont = 10;
            colocacao.add(new Pilotos(competidor.getName(), col, pont));
            col++;
            pont--;
        }
    }

    public static ArrayList<Pilotos> retornaClassificacao() {
        return colocacao;
        //Thread.sleep(15000);
    }

}
