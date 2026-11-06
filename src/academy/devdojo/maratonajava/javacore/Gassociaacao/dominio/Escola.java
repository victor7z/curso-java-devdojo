package academy.devdojo.maratonajava.javacore.Gassociaacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println("Nome da Escola: "+ this.nome);
        if (professores != null){
            for (Professor professor : professores){
                System.out.println("Professores: "+ professor.getNome());
            }
        }
    }

    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public Escola(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
