
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int inteiro = 5;
        int valor;
        int somaNegativos = 0;
        
        for(int i = 0; i < inteiro; ++i){
            System.out.print("Digite um número: ");
            valor = teclado.nextInt();
            
            if(valor < 0){
                somaNegativos = somaNegativos + 1;
            }
        }
        
        System.out.println("De " + inteiro + " valores digitados, " + somaNegativos + " são negativos!");
    }
    
}
