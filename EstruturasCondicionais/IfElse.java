package EstruturasCondicionais;

public class IfElse {
    public static void main(String[] args) {

        /*
        * IF: estruturas que avaliam se uma condição é verdadeira e escrevem algo quanto à essa condição.
        * ELSE: após todas as condições verificadas forem falsas, else imprime um resultado, e não precisa de condição.
        * Irei utilizar exemplos de níveis ninja.
        * ELSE IF: vai repetindo as condicionais após o IF até chegar no else e executar os comandos do código.
         */

        String nome = "Naruto Uzumaki";
        String vila = "Aldeia da folha";
        String rank = "Gennin";
        int idade = 16;
        short missoes = 5;

        if (missoes > 12 && missoes < 25){
            System.out.println("Rank = Chunnin");
        } else if (missoes >= 25){
            System.out.println("Rank = Jounnin");
        } else{
            System.out.println("Rank = gennin");
        }
    }
}
