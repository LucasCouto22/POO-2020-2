/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Lucas Couto
 */
public class Exercicio1{

    public static void main (String[] args){

        Agenda agendaTelefonica = new Agenda();
        Contato contatoTelefonico = new Contato();

        System.out.println("Nome: "+ agendaTelefonica.nome);
        System.out.println("Cidade: "+agendaTelefonica.cidade);
        System.out.println("De onde conheço: "+ agendaTelefonica.ondeConheco);
        System.out.println("DDD: "+ contatoTelefonico.ddd);
        System.out.println("Telefone: "+ contatoTelefonico.telefone);
        System.out.println("Operadora: "+ contatoTelefonico.operadora);

    }

}

    

