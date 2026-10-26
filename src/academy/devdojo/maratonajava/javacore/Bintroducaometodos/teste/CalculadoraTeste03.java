package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = (int) calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("---------");
        calculadora.imprimeDivisaoDeDoisNumeros(20,0);

    }
}
