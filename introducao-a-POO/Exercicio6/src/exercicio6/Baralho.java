package exercicio6;
import java.util.Random;
public class Baralho {
    
    
    private int primeiraCartaBaralho;
    private Cartas[] cartasDoBaralho;

    //funcao que gera baralho com todas as cartas de todos os naipes
    public Baralho(){
        
        primeiraCartaBaralho = 51;
        cartasDoBaralho = new Cartas[52];

        String[] naipes = {"Copas","Espadas","Ouros","Paus"};

        for (int i=0; i<52; ++i){
            cartasDoBaralho[i] = new Cartas(( i%13 ) + 1, naipes [i/13] );
        }
        
    }
    
    //funcao para retirar uma carta do baralho
    public Cartas tiraUmaCarta(){
        Cartas cartas = primeiraCartaBaralho>=0 ? cartasDoBaralho[primeiraCartaBaralho] : null;
        primeiraCartaBaralho--;
        return cartas;
    }

    //funcao para embaralhar as cartas do baralho
    public void embaralhaCartas(){
        
        Random aleatoria = new Random();
        int aux1 = 0;
        int aux2 = 0;
        
        for (int i=0; i<200; i++){
            
            aux1 = aleatoria.nextInt(52);
            aux2 = aleatoria.nextInt(52);
            Cartas carta_aleatoria = cartasDoBaralho[aux1];
            cartasDoBaralho[aux1] = cartasDoBaralho[aux2];
            cartasDoBaralho[aux2] = carta_aleatoria;
            
        }
        
    }
    
    //funcao para transformar em string as cartas e retornar
    public String transformaString(){
        
        String baralhoFull = "";
        for (int i=0; i<52; i++){
            baralhoFull = baralhoFull.concat("["+(i+1)+"]: "+cartasDoBaralho[i]+"\n");
        }
        return baralhoFull;
    }
    
}
