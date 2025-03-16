package Desafios.DesafioPilar;

public class NinjaAvancado implements Ninja{

    String nome;
    String especialidade;
    String habilidade;
    int idade;
    private TipoHabilidade habilidadeEspecial;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja é: " + nome);
        System.out.println("Especialidade do Ninja é: " + especialidade);
        System.out.println("Idade do Ninja é: " + idade);
        System.out.println("Habilidade do Ninja é: " + habilidade);
        System.out.println("Habilidade Especial do ninja é: " + habilidadeEspecial);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou " + nome + " e minha habilidade é " + habilidade);
    }

    public NinjaAvancado(String nome, String especialidade, String habilidade, int idade, TipoHabilidade habilidadeEspecial) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.habilidade = habilidade;
        this.idade = idade;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public NinjaAvancado() {
        this.nome = "desconhecido";
        this.especialidade = "desconhecida";
        this.habilidade = "desconhecida";
        this.idade = 0;
    }

}
