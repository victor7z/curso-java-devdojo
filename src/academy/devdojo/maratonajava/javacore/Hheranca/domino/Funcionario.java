package academy.devdojo.maratonajava.javacore.Hheranca.domino;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico funcionario");
    }

    {
        System.out.println("dentoro do bloco de inicialização1 funcionario");
    }
    {
        System.out.println("dentoro do bloco de inicialização2 funcionario");
    }


    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor do Funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorrioDePagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
