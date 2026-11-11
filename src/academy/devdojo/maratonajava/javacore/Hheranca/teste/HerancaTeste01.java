package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.domino.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domino.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domino.Pessoa;

public class HerancaTeste01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("03003-030");
        Pessoa pessoa = new Pessoa("Jorge");

        pessoa.setCpf("94582-574");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Simba");

        funcionario.setCpf("222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        System.out.println("==========");
        funcionario.imprime();

    }
}
