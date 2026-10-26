package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    static void main(String[] args) {
        int [] [] dias = new int [3] [3];
        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
