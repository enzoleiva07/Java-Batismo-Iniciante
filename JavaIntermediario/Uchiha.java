package JavaIntermediario;

public class Uchiha extends Ninja implements SharinganInterface{


    @Override
    public void habilidadeNinja(){
        System.out.println("Sou o " + nome + ", e essa é minha habilidade ninjaaaaaa toma " + habilidadeEspecial);
    }

    public Uchiha(String nome, String habilidadeEspecial, String estiloJutsu, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, habilidadeEspecial, estiloJutsu, idade, numeroDeMissoesConcluidas, rank);
    }

    public void AtivarOSharingan(){
       System.out.println("Eu sou o " + nome + ", e eu ativei meu sharingan de 3 tomoes.");
   }

    public Uchiha() {
        super();
    }
}
