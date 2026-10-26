public class Aula07Arrays01 {
    static void main(String[] args) {
        int [] idades = new int [3];
        idades [0] = 25;
        idades [1] = 16;
        idades [2] = 19;

        for (int i = 0; i < idades.length ; i++) {
            System.out.println("Jogador "+ i + ": "+idades[i]+"Anos");

        }
    }
}
