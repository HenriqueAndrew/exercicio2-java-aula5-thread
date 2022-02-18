package br.com.henriqueandrew.exercicio2;

// @author Henrique Andrew da Silva
public class CorridaMotocicletas {    

    public static void main(String[] args) {
        //for numero corridas = <11
        //num_corrida ++
        //if isAlive (false)

        /*idea: criar classe para threads de Corridas(com metodo corrida syncronized, onde apenas uma corrida sera iniciada por vez,
        nesta classe sera instanciado as threads dos competidores para executar a run(Classe Corrida), ao termino de cada corrida
        tentar implementar dentro da run da classe Corridas ou metodo a parte, a classificacao e pontuacao obtida da corrida realizada.
        Ao termino de todas as corridas, na classe CorridaMotocicletas, exibir a classificacao/pontuacao geral(variavel static) com o nome dos competidores (threads)

         */
        
        //for(int i = 0; i < 11; i++){
            ControleCorridas nCorrida = new ControleCorridas();
            nCorrida.novaCorrida();
            
        //}       

    }
}
