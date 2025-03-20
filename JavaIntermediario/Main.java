package JavaIntermediario;

public class Main {
    public static void main(String[] args) {

        Senju hashirama = new Senju("Hashirama Senju", "Mokuton", "Gigante de madeira", 36, 300, RankNinja.KAGE);
        hashirama.exibirInformacao();
        hashirama.habilidadeNinja();
        System.out.println();

        Senju tobirama = new Senju("Tobirama Senju", "Suiton", "Edo Tensei", 37, 500, RankNinja.KAGE );
        tobirama.exibirInformacao();
        tobirama.habilidadeNinja();
        System.out.println();

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Tsukuyomi", "Katon", 19, 23, RankNinja.JOUNIN);
        itachi.exibirInformacao();
        itachi.habilidadeNinja();
        itachi.AtivarOSharingan();
        System.out.println();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Kamui", "Raiton", 38, 150, RankNinja.KAGE);
        kakashi.exibirInformacao();
        kakashi.AtivarOSharingan();
        kakashi.eliteNinja();

    }
}