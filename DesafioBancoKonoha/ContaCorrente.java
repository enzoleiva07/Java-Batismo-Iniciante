package Desafios.DesafioBancoKonoha;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            System.out.println("Foi adicionado o valor de " + valor + ", e o saldo atual da conta corrente agora é: " + saldo);
        } else {
            System.out.println("Valor para saldo indisponível.");
        }
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }
}
