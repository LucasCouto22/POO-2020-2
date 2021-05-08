package exercicio2;
import java.util.ArrayList;

public class Aluno{ 

    float nota1;
    float nota2;
    float nota;
    int notas;
    float media;
    ArrayList<String> historico = new ArrayList();

    public float nota(float nota){
        this.nota = this.nota + nota;
        this.notas = this.notas + 1;
        return this.nota;
    }

    public float media(){
        this.media = this.nota / this.notas;
        return this.media;
    }

    public ArrayList<String> historico(){
        return this.historico;
    }   

    public float cr(){

        float notaTotal = 0;
        int contador = 0;
        float notaFim;

        for(String i : this.historico) {  
            
            notaTotal = notaTotal + this.historico.get(i);
            contador = contador + 1;
        }  

        notaFim = notaTotal / contador;

        return notaFim; 
    }

}
