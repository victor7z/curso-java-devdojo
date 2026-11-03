package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Testes;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Domino.Carro;

public class CarroTeste {
    static void main(String[] args) {

        Carro.setVelocidadeLimite(180);
        Carro carro01 = new Carro("BMW",280);
        Carro carro02 = new Carro("Mercedes", 275);
        Carro carro03 = new Carro("Audi", 290);


        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
