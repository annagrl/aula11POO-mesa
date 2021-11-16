package aula11;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Cachorro max = new Cachorro("Max",7);
        max.emitirSom();
        max.correr();

        Cavalo estrela = new Cavalo("Estrela",3);
        estrela.emitirSom();
        estrela.correr();

        Preguica soninho = new Preguica("Soninho",1);
        soninho.emitirSom();
        soninho.subirArvore();

    }
}
