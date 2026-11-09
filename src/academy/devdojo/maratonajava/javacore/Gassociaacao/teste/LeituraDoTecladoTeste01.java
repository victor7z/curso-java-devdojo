package academy.devdojo.maratonajava.javacore.Gassociaacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite Seu Nome Abaixo:");
        String nome = input.nextLine();
        System.out.println("Digite sua Idade:");
        int idade = input.nextInt();
        System.out.println("Seu nome é: "+ nome);
        System.out.println("Você tem: "+ idade+" Anos!");
    }
}
