package JavaIntermediario;

public abstract class Ninja implements AcoesNinja{

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, rank
    String nome;
    String habilidadeEspecial;
    String estiloJutsu;
    int idade;
    int numeroDeMissoesConcluidas;
    RankNinja rank;



    public Ninja() {
    }
    // Primeiro método criado
    public Ninja(String nome, String habilidadeEspecial, String estiloJutsu, int idade) {
        this.nome = nome;
        this.habilidadeEspecial = habilidadeEspecial;
        this.estiloJutsu = estiloJutsu;
        this.idade = idade;
    }

    //TODO: Sobrecarga do contrutor, para chamar os novos atributos da superclasse.
    // Sobrecarga do primeiro método com mais 2 atributos requisitados.
    public Ninja(String nome, String habilidadeEspecial, String estiloJutsu, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(nome, habilidadeEspecial, estiloJutsu, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void exibirInformacao(){
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Ativei a minha habilidade porraaaaaa toma " + habilidadeEspecial);
        System.out.println("Meu estilo é " + estiloJutsu);
        System.out.println("Eu concluí " + numeroDeMissoesConcluidas + " missões.");
        System.out.println("Meu rank é: " + rank);
    }

    @Override
    public void habilidadeNinja() {
        System.out.println("Essa é minha habilidade ninjaaa " + habilidadeEspecial);
    }

}
