package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class Professortest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre kame";
        professor.idade = 150;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
    }

}
