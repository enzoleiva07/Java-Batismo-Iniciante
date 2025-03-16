package Desafios.DesafioPilar;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninja = new NinjaBasico();
        ninja.mostrarInformacoes();
        ninja.executarHabilidade();
        System.out.println();

        NinjaAvancado narutin = new NinjaAvancado("Naruto Uzumaki", "Ar", "Rasengan", 15, TipoHabilidade.TAIJUTSU);
        narutin.mostrarInformacoes();
        narutin.executarHabilidade();
        System.out.println();

        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", "Fogo", "Mangekyou Sharingan", 17, TipoHabilidade.RINNEGAN);
        sasuke.mostrarInformacoes();
        System.out.println();
        sasuke.executarHabilidade();

        

    }
}
