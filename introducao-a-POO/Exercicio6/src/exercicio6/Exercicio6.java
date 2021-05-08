package exercicio6;

public class Exercicio6 {
    public static void main(String[] args) {

        Cartas carta = new Cartas(2, "Copas");
        System.out.println("Carta: " + carta);

        Baralho novoBaralho = new Baralho();
        System.out.println("\nBaralho sem embaralhar:\n" + novoBaralho);
        System.out.println("Tirando duas cartas: ");
        System.out.println(novoBaralho.tiraUmaCarta());
        System.out.println(novoBaralho.tiraUmaCarta());
        novoBaralho.embaralhaCartas();
        System.out.println("\n Carta depois de ser embaralhado o Baralho: ");
        System.out.println(novoBaralho);
        System.out.println("Primeira carta do topo depois de embaralhado: ");
        System.out.println(novoBaralho.tiraUmaCarta());

    }
}
