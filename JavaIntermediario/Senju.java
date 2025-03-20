package JavaIntermediario;

public class Senju extends Ninja{

    public Senju() {
        super();
    }

    public Senju(String nome, String habilidadeEspecial, String estiloJutsu, int idade) {
        super(nome, habilidadeEspecial, estiloJutsu, idade);
    }

    public Senju(String nome, String habilidadeEspecial, String estiloJutsu, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, habilidadeEspecial, estiloJutsu, idade, numeroDeMissoesConcluidas, rank);
    }
}
