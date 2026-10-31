package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class TesteFuncionario {
    static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("GOKU");
        funcionario1.setIdade(20);
        funcionario1.setSalarios(new double[] {1200, 987.32, 2000});
        funcionario1.exibirDados();


    }



}
