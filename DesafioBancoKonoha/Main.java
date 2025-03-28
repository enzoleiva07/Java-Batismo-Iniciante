package Desafios.DesafioBancoKonoha;

public class Main {
    public static void main(String[] args) {

        ContaCorrente Conta1 = new ContaCorrente(759);
        Conta1.consultarSaldo();
        Conta1.depositar(12.45);

        ContaPoupanca conta2 = new ContaPoupanca(1624.90);
        conta2.consultarSaldo();
        conta2.depositar(671.7);

    }
}
