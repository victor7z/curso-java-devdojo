package academy.devdojo.maratonajava.introducao;
//voce pode fazer uma doação de 500 reais p/ o canal dev dojo se salario >= 5000

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args) {
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condiçoes de doar, mas vou ter!";
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println (resultado);

    }
}
// operador ternario (condicao) ? verdadeiro : falso;