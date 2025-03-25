package encapsulamento;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Enzo Leiva", 4000.00);
        conta1.Depositar(120);
        conta1.sacar(4120);
        System.out.println("Titular da conta: " + conta1.getTitular());
        System.out.println("Saldo da conta: " + conta1.getSaldo());
        System.out.println();

        ContaBancaria conta2 = new ContaBancaria("Rafael Freitas", 1293.12);
        System.out.println("Titular da conta: " + conta2.getTitular());
        System.out.println("Titular da conta: " + conta2.getSaldo());

    }
}
