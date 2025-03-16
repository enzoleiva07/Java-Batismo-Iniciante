package Desafios.DesafioPilar;

public class NinjaBasico implements Ninja{

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja Desconhecido");
    }
    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade desconhecida");
    }
}
