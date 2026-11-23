package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    static void main(String[] args) {
        Computador computador = new Computador("Dell", 7000);
        Tomate tomate = new Tomate("tomate cereja", 10);
        CalculadoraImposto.CalcularImpostoComputador(computador);
        System.out.println();
        CalculadoraImposto.CalcularImpostoTomate(tomate);


    }
}
