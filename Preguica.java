package aula11;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("Eu emito sons de alta-frequência pelas narinas");
    }
    public void subirArvore(){
        System.out.println("Eu subo em árvore");
    }
}
