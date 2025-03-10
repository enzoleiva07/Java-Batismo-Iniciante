package EstruturasCondicionais;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        /*
        * Ternario: Estrutura de condição mais enxuta e simles.
        * var = (condiçaõ) ? "valor se for verdade" : "valor de for falso".
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        String resultado = (idade >= 18) ? "Você é maior de idade. " : "Você é menor de idade.";
        System.out.println(resultado);

        scanner.close();
    }
}
