package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main (String[] args){
        double salarioAnual= 200.000;
        double impostoBaixaRenda = 9.70 / 100;
        double impostoMediaRenda = 37.35 / 100;
        double impostoAltaRenda = 49.50 / 100;
        double impostoAnual;

        if (salarioAnual <=34712){
            impostoAnual = salarioAnual * impostoBaixaRenda;
        } else if (salarioAnual >=34.713 && salarioAnual <= 68.507){
            impostoAnual = salarioAnual * impostoMediaRenda;
        } else {
            impostoAnual = salarioAnual * impostoAltaRenda;
        }
        System.out.println(impostoAnual);

    }

}
