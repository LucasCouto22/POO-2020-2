package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a ordem que a matriz quadrada deve ter: ");
        int ordem = teclado.nextInt();

        int []valores1 = new int[ordem];
        int []valores2 = new int[ordem];
        int soma1 = 0;
        int soma2 = 0;

        int[][] matriz = new int[ordem][ordem];
        System.out.println("\nMatriz "+ordem+" por "+ordem+":\n");

        for (int i=0 ; i<ordem; i++){
            
            for (int j=0; j<ordem; j++){
                
                System.out.print("Digite o valor do elemento ["+(i+1)+"]["+(j+1)+"]: ");
                int entrada = teclado.nextInt();
                valores1[i]+=entrada;
                valores2[j]+=entrada;
                
                if (i==j){
                    soma1+=entrada;
                }
                if (j==ordem-i-1){
                    soma2+=entrada;
                }
                
            }
            
        }
        
        boolean quadradoMagico = (soma1==soma2) && (valores1[0]==soma1) && (valores2[0]==soma1);
        
        for (int i=1; i<ordem && quadradoMagico; i++){
            quadradoMagico = (valores1[i]==valores2[i]) && (valores1[i-1]==valores2[i]);
        }
        if (quadradoMagico){
            System.out.println("Analisando a matriz, chegamos a conclusão de que ela é um quadrado mágico.");
        }
        else{
            System.out.println("Analisando a matriz, chegamos a conclusão de que ela não é um quadrado mágico.");
        }

    }
    
}
