package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie Variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main (String[] args) {
        String nome = "Victor";
        String endereco = "Rua imaginaria 123";
        double salario = 2500.12;
        String dataRecebimentoSalario = "17/09/2026";
        String relatorio = "Eu "+ nome +", morando no endereço "+ endereco + ", confirmo que recebi o salário de " + salario +", na data "+ dataRecebimentoSalario;

        System.out.println (relatorio);
    }

}
