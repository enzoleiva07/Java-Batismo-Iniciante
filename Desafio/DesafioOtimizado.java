package Desafio;

public class DesafioOtimizado {
    public static void main(String[] args) {
        //Ninja1
        String nome = "Konohamaru";
        String missao = "Correr atrás do cachorro";
        int idade = 13;
        char rank = 'D';
        String status = "Em andamento";

        if(idade < 15){
            if (rank == 'C' || rank == 'D'){
                status = "Concluído";
            } else{
                status = "Não concluído";
            }
        } else{
            status = "Concluído";
        }

        System.out.println("---------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Rank da missão: " + rank);
        System.out.println("Status da missão: " + status);
        System.out.println("---------------------------------------");

        //Ninja2
        String nome2 = "Sasuke";
        String missao2 = "Reconhecimento";
        int idade2 = 15;
        char rank2 = 'A';
        String status2 = "Concluído";

        if(idade < 15){
            if (rank2 == 'C' || rank2 == 'D'){
                status = "Concluído";
            } else{
                status = "Não concluído";
            }
        } else{
            status = "Concluído";
        }

        System.out.println("---------------------------------------");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Rank da missão: " + rank2);
        System.out.println("Status da missão: " + status2);
        System.out.println("---------------------------------------");

        //Ninja3
        String nome3 = "Naruto";
        String missao3 = "Escoltar o engenheiro";
        int idade3 = 14;
        char rank3 = 'B';
        String status3 = "Não concluído";

        if(idade < 15){
            if (rank3 == 'C' || rank3 == 'D'){
                status = "Concluído";
            } else{
                status = "Não concluído";
            }
        } else{
            status = "Concluído";
        }

        System.out.println("---------------------------------------");
        System.out.println("Nome: " + nome3);
        System.out.println("Idade " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Rank da missão: " + rank3);
        System.out.println("Status da missão: " + status3);
        System.out.println("---------------------------------------");




    }
}
