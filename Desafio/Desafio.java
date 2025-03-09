package Desafio;

public class Desafio {
    public static void main(String[] args) {
        //ninja1
        String nomeNinja1 = "Shikamaru Nara";
        String missaoNinja1 = "Espionar Orochimaru";
        char rankMissao1 = 'A';
        short idade1 = 16;
        boolean statusConclusao1;

        System.out.println("Nome do primeiro ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idade1);
        System.out.println("Objetivo da missão: " + missaoNinja1);
        System.out.println("Rank da missão; " + rankMissao1);

        //verificação de condicional 2
        if (idade1 >= 15) {
            statusConclusao1 = true;
            System.out.println("Missão Concluída? " + statusConclusao1);
        } else {
            statusConclusao1 = false;
            System.out.println("O ninja só tem permissão de concluir missões de rank C ou D, devido à sua idade.");
        }
        System.out.println();

        //ninja 2
        String nomeNinja2 = "Naruto Uzumaki";
        String missaoNinja2 = "Escoltar  mercador no país da névoa.";
        char rankMissao2 = 'B';
        short idade2 = 14;
        boolean status2;

        System.out.println("Nome do segundo Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Objetivo da missão: " + missaoNinja2);
        System.out.println("Rank da missão: " + rankMissao2);

        //verificação de condicionais 2
        if ((idade2 < 15) && (rankMissao2 == 'B')) {
            status2 = false;
            System.out.println("O ninja não pode concluir sua missão pois não possui a idade necessária para este nível de missão.");
            System.out.println("Missão concluída? " + status2);
        } else if (rankMissao2 == 'A') {
            status2 = false;
            System.out.println("O ninja não pode concluir sua missão pois não possui a idade necessária para este nível de missão.");
            System.out.println("Missão concluída? " + status2);
        } else if (rankMissao2 == 'S') {
            status2 = false;
            System.out.println("O ninja não pode concluir sua missão pois não possui a idade necessária para este nível de missão.");
            System.out.println("Missão concluída? " + status2);
        } else {
            status2 = true;
            System.out.println("Missão Concluída? " + status2);
        }
        System.out.println();

        //Ninja 3
        String nomeNinja3 = "Itachi Uchiha";
        String missaoNinja3 = "(CONFIDENCIAL)  Eliminar todo o clã Uchiha";
        char rankMissao3 = 'S';
        short idade3 = 16;
        boolean status3;

        System.out.println("Nome do terceiro ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Objetivo da missão: " + missaoNinja3);
        System.out.println("Rank da missão: " + rankMissao3);
        //verificação de condicionais 3
        if (idade3 >= 15) {
            status3 = true;
            System.out.println("Missão concluida? " + status3);
        } else {
            status3 = false;
            System.out.println("O ninja não pode concluir sua missão pois não possui a idade necessária para este nível de missão.");
        }
    }
}
