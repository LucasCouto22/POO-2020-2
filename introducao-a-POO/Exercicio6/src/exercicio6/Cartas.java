package exercicio6;

public class Cartas {
    
    int numeroCarta;
    String naipeCarta;
    
    //funcao que define salva as informações recebidas o naipe e numero no objeto
    public Cartas(int numero, String naipe) {
        
        if ((numeroCarta >= 1 || numeroCarta <= 13) && (naipe == "Copas" || naipe == "Espadas" || naipe == "Ouros" || naipe == "Paus")) {
            
            naipeCarta = naipe;
            numeroCarta = numero;
            
        }
        else{
            
            naipeCarta = "Esse naipe não existe";
            numeroCarta = 0;
            
        }
    }
    
    //funcao para retornar em string a carta
    public String transformaString(){
        String[] cartas = {"Carta não existe", "Ás", "2", "3", "4", "5", "6", "7", "8", "9","10", "Valete", "Dama", "Rei"};
        return cartas[numeroCarta]+" de "+ numeroCarta+".";
    }
}
