package academy.devdojo.maratonajava.javacore.Gassociaacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociaacao.dominio.Jogador;

public class JogadorTeste {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("CR7");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
