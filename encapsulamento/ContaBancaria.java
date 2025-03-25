package encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(String titular, double saldo) {
        if (!titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Impossível criar conta sem nome de titular. ");
        }
        if (saldo >= 0){
            this.saldo = saldo;
        } else{
            this.saldo = 0;
            System.out.println("Valor negativo inválido ao criar uma conta bancária. Saldo definido como 0.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (!titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Impossível criar conta sem nome de titular. ");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Depósito de dinheiro
    public void Depositar(double valor){
        if (valor >= 0){
            saldo += valor;
            System.out.println("Foi depositado " + valor + " e seu saldo atual agora é: " + saldo);
        } else {
            System.out.println("Impossível depositar valor negativo.");
        }
    }

    //Saque de dinheiro
    public boolean sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Foi sacado " + valor + " e seu saldo atual agora é: " + saldo);
            return true;
        } else {
            System.out.println("Impossível sacar valor negativo.");
            return false;
        }
    }
}
