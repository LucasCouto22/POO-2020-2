package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int totalNotas = 0;
        int pessimas = 0;
        int ruins = 0;
        int boas = 0;
        int otimas = 0;
        int nota = 0;
        
        while(nota >= 0 && nota < 101){
            System.out.print("Digite uma nota de 0 a 100 para a qualidade das refeições: ");
            nota = teclado.nextInt();
            totalNotas = totalNotas + 1;
            if(nota >= 0 && nota < 26){
                pessimas = pessimas + 1;
                System.out.println("Caso tenham terminado as avaliações, digite 101.");
            }
            else if(nota > 25 && nota < 51){
                ruins = ruins + 1;
                System.out.println("Caso tenham terminado as avaliações, digite 101.");
            }
            else if(nota > 50 && nota < 76){
                boas = boas + 1;
                System.out.println("Caso tenham terminado as avaliações, digite 101.");
            }
            else if(nota > 75 && nota < 101){
                otimas = otimas + 1;
                System.out.println("Caso tenham terminado as avaliações, digite 101.");
            }
            else{
                continue;
            }
        }
        
        totalNotas = totalNotas - 1;
        
        float resultadoPessimas = (float)pessimas/totalNotas * 100;
        System.out.println("Votos por comida Péssima = " + resultadoPessimas + "%");
        
        float resultadoRuins = (float)ruins/totalNotas * 100;
        System.out.println("Votos por comida Ruim = " + resultadoRuins + "%");
        
        float resultadoBoas = (float)boas/totalNotas * 100;
        System.out.println("Votos por comida Boa = " + resultadoBoas + "%");
        
        float resultadoOtimas = (float)otimas/totalNotas * 100;
        System.out.println("Votos por comida Ótima = " + resultadoOtimas + "%");
    }
    
}
