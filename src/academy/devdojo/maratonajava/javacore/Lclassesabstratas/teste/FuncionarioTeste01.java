package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    static void main(String[] args) {
        Gerente gerente01 = new Gerente("nami", 5000);
        System.out.println(gerente01);
        System.out.println();

        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Dev",12000);
        System.out.println(desenvolvedor01);
        gerente01.imprime();
        desenvolvedor01.imprime();

    }
}
