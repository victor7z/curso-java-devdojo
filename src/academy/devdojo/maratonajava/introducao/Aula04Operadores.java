package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main (String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int soma = numero01 + numero02;
        System.out.println ("Esse é o resultado da soma: " + soma);
        int resto = 21 % 7;
        System.out.println (resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;

        System.out.println (isDezMaiorQueVinte);
        System.out.println (isDezMenorQueVinte);
        System.out.println (isDezIgualQueVinte);

         // && (and) || (or) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println ("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupaca = 4800;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupaca >= valorPlaystation || valorTotalContaCorrente + valorTotalContaPoupaca >= valorPlaystation;
        System.out.println ("você pode comprar um PlayStation5? " + isPlaystationCincoCompravel);

        // =  += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 800;
        bonus += 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;

        System.out.println(contador);
    }
}
