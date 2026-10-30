package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Jiraya");
        pessoa1.setIdade(70);
        pessoa1.imprime();
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
    }
}
