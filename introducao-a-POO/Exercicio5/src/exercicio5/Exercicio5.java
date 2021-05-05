package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Televisao tv = new Televisao();

        tv.ligarTelevisao();
        tv.alterarCanalFixoTelevisao(96);
        tv.alterarCanalAcimaTelevisao();
        tv.alterarCanalAcimaTelevisao();
        tv.alterarCanalAcimaTelevisao();
        
        
        tv.alterarCanalAbaixoTelevisao();
        tv.alterarCanalAbaixoTelevisao();
        tv.alterarCanalAbaixoTelevisao();
        tv.alterarCanalFixoTelevisao(2);
        tv.alterarCanalAbaixoTelevisao();
        tv.alterarCanalAbaixoTelevisao();
        tv.alterarCanalAbaixoTelevisao();


        tv.alterarVolumeAcimaTelevisao();
        tv.alterarVolumeAcimaTelevisao();
        tv.alterarVolumeAcimaTelevisao();
        tv.alterarCanalFixoTelevisao(30);
        tv.alterarVolumeAcimaTelevisao();
        tv.silenciarTelevisao();
        tv.alterarVolumeAbaixoTelevisao();
        tv.dessilenciarTelevisao();
        tv.desligarTelevisao();
        tv.ligarTelevisao();

        tv.estadoTelevisao();
        
    }
    
}
