package JavaIntermediario.Desafio;
import java.util.Scanner;
public class ObjetoDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Uchiha[] uchihas = new Uchiha[2];
        Uchiha novoUchiha = new Uchiha();

        int contador = 0;
        int menu = 0;
        while (menu != 4){
            System.out.println("\n-------------Menu de opções ninjas-------------");
            System.out.println("1 - Criar um Uchiha ");
            System.out.println("2 - Atribuir a habilidade especial Uchiha ");
            System.out.println("3 - Exibir informações dos Uchihas ");
            System.out.println("4 - encerrar programa. ");

            System.out.print("Escolha uma das 4 opções. ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu){
                case 1:
                    if (contador < uchihas.length){
                        System.out.println("\n-------------------Monte seu Uchiha!!!-------------------");
                        System.out.print("Digite o nome do seu Uchiha: ");
                        novoUchiha.nome = scan.nextLine();
                        System.out.println("Você criou um nome.");
                        System.out.println();

                        System.out.print("Qual a sua missão? ");
                        novoUchiha.missao = scan.nextLine();
                        System.out.println("Você o deu uma missão.");
                        System.out.println();

                        System.out.print("Quantos anos esse Uchiha tem? ");
                        novoUchiha.idade = scan.nextInt();
                        System.out.println("Você o deu uma idade.");
                        scan.nextLine();
                        System.out.println();

                        System.out.print("Qual o nível de dificuldade dessa missão? ");
                        novoUchiha.NivelDeDificuldade = scan.nextLine();
                        System.out.println("Você o deu um nível de dificuldade.");
                        System.out.println();

                        System.out.print("Qual o status da missão? ");
                        novoUchiha.StatusDaMissao = scan.nextLine();
                        System.out.println("Você definiu o status da missão.");

                        uchihas[contador] = novoUchiha;
                        contador++;
                    } else {
                        System.out.println("Máximo de Uchihas cadastrados. ");
                    }
                    break;
                case 2:
                    System.out.println("Qual será a habilidade especial desse Uchiha? ");
                    novoUchiha.habilidadeEspecial = scan.nextLine();
                    System.out.println("Habilidade atribuida.");
                    break;
                case 3:
                    for (int i = 0; i < uchihas.length; i++) {
                        if (uchihas[i] != null){
                            System.out.println(uchihas[i]);
                            uchihas[i].MostrarHabilidadeEspecial();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente. ");
            }
        }
    }
}