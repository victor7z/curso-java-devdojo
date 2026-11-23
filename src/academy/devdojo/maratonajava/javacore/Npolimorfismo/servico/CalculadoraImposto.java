package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void CalcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("computador " + computador.getNome());
        System.out.println("valor do computador " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }



        public static void CalcularImpostoTomate(Tomate tomate){
            System.out.println("Relatório de imposto do tomate");
            double imposto = tomate.calcularImposto();
            System.out.println("tomate "+ tomate.getNome());
            System.out.println("valor do tomate "+ tomate.getValor());
            System.out.println("Imposto a ser pago "+ imposto);
        }
}

