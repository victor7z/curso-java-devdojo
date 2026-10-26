package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >=1000
    public static void main (String[]args) {
        double valorDoCarro = 40000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }


}


