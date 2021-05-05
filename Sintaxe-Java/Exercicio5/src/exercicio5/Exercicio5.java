package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int valor;
        int soma = 1;

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        if(valor > 0){
            for(int i = valor; i >= 1; --i){
                soma = soma * i;
            }

            System.out.print("Valor do fatorial de "+ valor + " é: " + soma);
            
        }
        else if(valor == 0){
            System.out.print("Valor do fatorial de 0 é: 1");
        }
        else{
            
            System.out.print("Valor inserido é menor que 1, o resultado é = -1");
            
        }
    }
    
}
