package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Viland Saga", "Tv", 12);
        anime.setGenero("Ação");
        anime.imprimirAnime();
    }
}
