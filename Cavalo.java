package aula11;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("Eu relincho");

    }
    public void correr(){
        System.out.println("Eu corro 88 Km/h");
    }


}
