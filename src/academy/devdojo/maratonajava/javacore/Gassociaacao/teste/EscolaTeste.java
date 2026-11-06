package academy.devdojo.maratonajava.javacore.Gassociaacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociaacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociaacao.dominio.Professor;

public class EscolaTeste {
    static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professores = new Professor[]{professor};
        Escola escola = new Escola("Adventista",professores);

        escola.imprime();
    }
}
