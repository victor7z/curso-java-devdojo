package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2007;

        Carro carro2 = new Carro();
        carro2.nome = "Mitsubshi";
        carro2.modelo = "GTR-R35";
        carro2.ano = 2014;

        carro1 = carro2;

        System.out.println("Nome do Carro: "+ carro1.nome + " | Modelo do Carro: "+ carro1.modelo+ " | Ano do Carro: "+ carro1.ano);
        System.out.println("Nome do Carro: "+ carro2.nome + " | Modelo do Carro: "+ carro2.modelo+ " | Ano do Carro: "+ carro2.ano);
    }
}
