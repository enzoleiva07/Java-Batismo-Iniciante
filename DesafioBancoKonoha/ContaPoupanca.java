package Desafios.DesafioBancoKonoha;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            valor = valor + (valor*0.01);
            saldo += valor;
            System.out.println("Foi adicionado o valor de " + valor + ", e o saldo atual da conta poupança agora é: " + saldo);
        } else {
            System.out.println("Valor para saldo indisponível.");
        }
    }
}
