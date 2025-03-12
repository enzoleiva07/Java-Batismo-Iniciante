package JavaIntermediario.Desafio;

import java.util.Scanner;

public class ObjetoDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Uchiha user = new Uchiha();
        System.out.println("-------------------Monte seu Uchiha!!!-------------------");

        System.out.print("Digite o nome do seu Uchiha: ");
        user.nome = scan.nextLine();
        System.out.println("Você criou um nome.");
        System.out.println();

        System.out.print("Qual a sua missão? ");
        user.missao = scan.nextLine();
        System.out.println("Você o deu uma missão.");
        System.out.println();

        System.out.print("Quantos anos esse Uchiha tem? ");
        user.idade = scan.nextInt();
        System.out.println("Você o deu uma idade.");
        scan.nextLine();
        System.out.println();

        System.out.print("Qual o nível de dificuldade dessa missão? ");
        user.NivelDeDificuldade = scan.nextLine();
        System.out.println("Você o deu um nível de dificuldade.");
        System.out.println();

        System.out.print("Qual o status da missão? ");
        user.StatusDaMissao = scan.nextLine();
        System.out.println("Você definiu o status da missão.");

        int menu = 0;
        while (menu != 3){
            System.out.println("\n-------------Menu de opções ninjas-------------");
            System.out.println("1 - Exibir informações do uchiha criado ");
            System.out.println("2 - Mudar habilidade especial do Uchiha ");
            System.out.println("3 - encerrar programa. ");

            System.out.println("Escolha uma das 3 opções. ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu){
                case 1:
                    user.MostrarHabilidadeEspecial();
                    break;
                case 2:
                    System.out.println("Qual será a nova habilidade especial desse Uchiha? ");
                    user.habilidadeEspecial = scan.nextLine();
                    System.out.println("Habilidade atribuida.");
                    break;
                case 3:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente. ");
            }
        }

    }
}
