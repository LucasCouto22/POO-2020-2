package exercicio2;

import java.util.Scanner;


public class Exercicio2 {


    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int R;
        int S;
        int T;
        
        System.out.print("Digite o valor R: ");
        R = teclado.nextInt();
        System.out.print("Digite o valor S: ");
        S = teclado.nextInt();
        System.out.print("Digite o valor T: ");
        T = teclado.nextInt();
        
        if(R > S && R > T ){
            System.out.println("O valor de R é o maior.");
        }
        else if(S > R && S > T){
            System.out.println("O valor de S é o maior.");
        }
        else if(T > R && T > S){
            System.out.println("O valor de T é o maior.");
        }
        else if(R == S && R > T){
            System.out.print("Os valores R e S são iguais e os maiores.");
        }
        else if(R == T && R > S){
            System.out.print("Os valores R e T são iguais e os maiores.");
        }
        else if(S == T && S > R){
            System.out.print("Os valores S e T são iguais e os maiores.");
        }
        else if(R == S && T == R){
            System.out.print("Todos os valores são iguais.");
        }
        
    }
    
}
