package academy.devdojo.maratonajava.javacore.Gassociaacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociaacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociaacao.dominio.Time;

public class JogadorTeste03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        Jogador[] jogadores = new Jogador[]{jogador,jogador2};
        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("==========JOGADOR==============");
        jogador.imprime();

        System.out.println("==========TIME==============");
        time.imprime();

    }
}
