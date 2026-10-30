package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class TesteFuncionario {
    static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "GOKU";
        funcionario1.idade = 20;
        funcionario1.salarios = new double[]{1200, 987.32, 2000};
        funcionario1.exibirDados();


    }



}
