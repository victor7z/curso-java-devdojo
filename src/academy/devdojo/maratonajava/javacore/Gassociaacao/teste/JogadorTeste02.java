package academy.devdojo.maratonajava.javacore.Gassociaacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociaacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociaacao.dominio.Time;

public class JogadorTeste02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romario");
        Jogador jogador2 = new Jogador("Ronaldinho Gaucho");

        Time time1 = new Time("São Paulo");
        Time time2 = new Time("Real Madrid");

        jogador1.setTime(time1);
        jogador2.setTime(time2);

        jogador1.imprime();
        jogador2.imprime();

    }

}
