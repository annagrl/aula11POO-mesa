package aula11;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("Eu faço au au");
    }
    void correr() {
        System.out.println("Eu corro 60 Km/h");
    }
}
