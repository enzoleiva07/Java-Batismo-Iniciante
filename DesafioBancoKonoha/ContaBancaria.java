package Desafios.DesafioBancoKonoha;

public abstract class ContaBancaria implements Conta {

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo(){
        if (saldo > 0){
            System.out.println("O saldo disponível é: " + saldo);
        } else {
            System.out.println("Saldo inserido é negativo. Inválido.");
        }
    }
}
