package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculaddoraTest04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a , b);
        System.out.println("Dentro CalculaddoraTest04");
        System.out.println("Num1 "+ a);
        System.out.println("Num2 "+ b);

    }
}
