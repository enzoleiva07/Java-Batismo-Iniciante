package EstruturasCondicionais;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*
         *SwichCases: Servem para gerar casos específicos.
         * Objetivo: O usuário escolhe entre ações disponíveis
         * */

        //abrir scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é um barbaro em combate. Qual a sua ação? (1- Correr|2- Atacar com o machado |3- Usar poção de cura)");

        int acao = scanner.nextInt();
        switch (acao){
            case 1:
                System.out.println("Você correu igual um covarde");
                break;
            case 2:
                System.out.println("Você arrancou o braço do inimigo e o incapacitou.");
                break;
            case 3:
                System.out.println("Você se curou porém perderu seu turno e foi atacado novamente.");
                break;
            default:
                System.out.println("TEM 3 OPÇÕES NA PORRA DA TELA E TU ESCOLHE UMA QUE NÃO EXISTE??? tenta de novo.");
        }
        //fechar scanner
        scanner.close();
    }
}
