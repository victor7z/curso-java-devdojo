package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("fazendo cheacagem de permissões");
    }
}
