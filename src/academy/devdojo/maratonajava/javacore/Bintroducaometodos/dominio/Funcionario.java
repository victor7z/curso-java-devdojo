package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void exibirDados() {
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        if (salarios != null) {
            for (int i = 0; i < salarios.length; i++) {
                System.out.println("SALARIO: " + this.salarios[i]);
            }
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
            for (double salario : salarios) {
                media += salario;
            }
        media /= salarios.length;
        System.out.println("Media salarial " + media);
    }

}
