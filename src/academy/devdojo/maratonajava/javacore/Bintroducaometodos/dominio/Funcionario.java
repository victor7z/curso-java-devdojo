package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


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
            for (double salario : salarios) {
                media += salario;
            }
        media /= salarios.length;
        System.out.println("Media salarial " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


}
