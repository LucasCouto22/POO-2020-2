package exercicio3;

public class Exercicio3 {

    public static void main (String[] args){

        Porta porta = new Porta();
        
        porta.altura = 2.10f;
        porta.largura = 0.80f;
        porta.cor = "vermelho";
        porta.situacaoPorta = 1;

        porta.estaAberta();

        porta.mudaCor("verde");

        porta.fecharPorta();
        porta.estaAberta();
        System.out.println("Cor da porta: "+ porta.cor);

        porta.mudaCor("azul");
        porta.abrirPorta();
        porta.estaAberta();
        System.out.println("Cor da porta: "+ porta.cor);

    }
    
}
