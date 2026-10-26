package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args){
        //Dados os valores de 1 a 7, imprima se é dia ultil ou final de semana
        //Considerando 1 como Domingo

        byte dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo é final de semana");
            break;
            case 2:
                System.out.println("Segunda é dia util");
                break;
            case 3:
                System.out.println("Terça é dia util");
                break;
            case 4:
                System.out.println("Quarta é dia util");
                break;
            case 5:
                System.out.println("Quinta é dia util");
                break;
            case 6:
                System.out.println("Sexta é dia util");
                break;
            case 7:
                System.out.println("Sabádo é final de semana");
                break;
            default:
                System.out.println("Opção invalida, Escolha de 1 à 7");
                break;
        }
    }
}
