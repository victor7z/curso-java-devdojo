package academy.devdojo.maratonajava.introducao;

// idade < 15 categoria infantil
// idade >= 15 && idade < 18 categoria juvenil
// idade >= 18 categoria adulta


public class Aula05EstruturasCondicionais02 {
    public static void main (String [] args) {
    int idade = 19;
    String categoria;

    if (idade < 15) {
        categoria = ("categoria infantil");
    }else if (idade >=15 && idade < 18 ){
        categoria = ("categoria Juvenil");
    }else {
        categoria = ("categoria adulta");
    }

    System.out.println(categoria);


    }
}
