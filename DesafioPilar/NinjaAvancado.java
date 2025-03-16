package Desafios.DesafioPilar;

public class NinjaAvancado implements Ninja{

    String nome;
    String especialidade;
    String habilidade;
    int idade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja é: " + nome);
        System.out.println("Especialidade do Ninja é: " + especialidade);
        System.out.println("Idade do Ninja é: " + idade);
        System.out.println("Habilidade do Ninja é: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou " + nome + " e minha habilidade é " + habilidade);
    }

    public NinjaAvancado(String nome, String especialidade, String habilidade, int idade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    public NinjaAvancado() {
        this.nome = "desconhecido";
        this.especialidade = "desconhecida";
        this.habilidade = "desconhecida";
        this.idade = 0;
    }

}
