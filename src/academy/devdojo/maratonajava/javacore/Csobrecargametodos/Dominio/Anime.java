package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Dominio;

public class Anime {
    private  String nome;
    private String tipo;
    private int episodios;
    private String genero;


    public void imprimirAnime(){
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Episodios: "+ this.episodios);
        System.out.println("Genero: "+ this.genero);
    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
