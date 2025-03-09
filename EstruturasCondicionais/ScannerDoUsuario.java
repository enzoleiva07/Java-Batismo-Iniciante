package EstruturasCondicionais;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = Scanner.nextLine();
        System.out.println("Seu nome é: " + nome);

        System.out.print("Digite sua idade: ");
        int idade = Scanner.nextInt();
        System.out.println("Sua idade é: " + idade);

        if(idade >= 18){
            if(idade > 100){
                System.out.println("TU JA TA MORTO PORRA");
            } else{
                System.out.println("Você já ta podendo ir pro puteiro");
            }
        } else{
            System.out.println("Você não pode votar ainda seu otário kkkj");
        }

        Scanner.close();
    }
}
