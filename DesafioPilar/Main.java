package Desafios.DesafioPilar;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninja = new NinjaBasico();
        ninja.mostrarInformacoes();
        ninja.executarHabilidade();
        System.out.println();

        NinjaAvancado narutin = new NinjaAvancado("Naruto Uzumaki", "Ar", "Rasengan", 15);
        narutin.mostrarInformacoes();
        narutin.executarHabilidade();

    }
}
