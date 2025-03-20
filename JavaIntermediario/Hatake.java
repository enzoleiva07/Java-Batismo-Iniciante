package JavaIntermediario;

public class Hatake extends Ninja implements SharinganInterface, EliteAmbu{

    public Hatake(String nome, String habilidadeEspecial, String estiloJutsu, int idade) {
        super(nome, habilidadeEspecial, estiloJutsu, idade);
    }

    public void eliteNinja() {
        System.out.println("Eu sou " + nome + ", e eu fui da elite ANBU.");
    }

    public void AtivarOSharingan(){
        System.out.println("Eu sou o " + nome + ", e eu ativei meu sharingan de um olho só.");
    }

    public Hatake(String nome, String habilidadeEspecial, String estiloJutsu, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, habilidadeEspecial, estiloJutsu, idade, numeroDeMissoesConcluidas, rank);
    }
}
