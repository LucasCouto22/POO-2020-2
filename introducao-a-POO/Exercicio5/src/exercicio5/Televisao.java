package exercicio5;

public class Televisao {
    
    boolean estado = false;
    //estado ligada = True e desligada = False
    boolean silencioso = false;
    int canal;
    int volume;
    
    public void ligarTelevisao(){
        if(estado == true){
            System.out.println("A TV já está ligada.");
        }else{
            estado = true;
            System.out.println("A TV foi ligada.");
        }
    }
    
    public void desligarTelevisao(){
        if(estado == false){
            System.out.println("A TV já está desligada.");
        }else{
            estado = false;
            System.out.println("A TV foi desligada.");
        }
    }
    
    public void silenciarTelevisao(){
        if(silencioso == true){
            System.out.println("A TV já está silenciada.");
        }else{
            silencioso = true;
            System.out.println("A TV foi silenciada.");
        }
    }
    
    public void dessilenciarTelevisao(){
        if(silencioso == false){
            System.out.println("A TV já com som ativo.");
        }else{
            silencioso = false;
            System.out.println("A TV teve seu som ativo.");
        }
    }
    
    public void alterarCanalFixoTelevisao(int numCanal){
        if(estado == false){
            System.out.println("Não pode alterar o canal, a TV está desligada.");
        }
        else{
            if(numCanal >= 0 && numCanal < 100){
                canal = numCanal;
                System.out.println("A TV teve seu canal alterado para "+canal);
            }else{
                System.out.println("O canal que deseja colocar na TV é inválido e deve estar no intervalo de 0 a 99.");
            }
        }
    }
    
    public void alterarCanalAcimaTelevisao(){
        if(estado == false){
            System.out.println("Não pode alterar o canal, a TV está desligada.");
        }
        else{
            if(canal < 99){
                canal = canal + 1;
                System.out.println("A TV teve seu canal alterado para "+canal);
            }else{
                System.out.println("O canal que deseja colocar na TV é inválido e deve estar no intervalo de 0 a 99.");
            }
        }
    }
    
    public void alterarCanalAbaixoTelevisao(){
        if(estado == false){
            System.out.println("Não pode alterar o canal, a TV está desligada.");
        }
        else{
            if(canal > 0){
                canal = canal - 1;
                System.out.println("A TV teve seu canal alterado para "+canal);
            }else{
                System.out.println("O canal que deseja colocar na TV é inválido e deve estar no intervalo de 0 a 99.");
            }
        }
    }
    
    public void alterarVolumeAcimaTelevisao(){
        if(silencioso == true){
            System.out.println("Não pode alterar o volume, a TV está no modo Silencioso.");
        }
        else{
            if(estado == false){
                System.out.println("Não pode alterar o volume, a TV está desligada.");
            }
            else{
                if(volume < 10){
                    volume = volume + 1;
                    System.out.println("A TV teve seu volume alterado para "+volume);
                }else{
                    System.out.println("O volume que deseja colocar na TV é inválido e deve estar no intervalo de 0 a 10.");
                }
            }
        }
    }
    
    public void alterarVolumeAbaixoTelevisao(){
        if(silencioso == true){
            System.out.println("Não pode alterar o volume, a TV está no modo Silencioso.");
        }
        else{
            if(estado == false){
                System.out.println("Não pode alterar o volume, a TV está desligada.");
            }
            else{
                if(volume >= 0){
                    volume = volume - 1;
                    System.out.println("A TV teve seu volume alterado para "+volume);
                }else{
                    System.out.println("O volume que deseja colocar na TV é inválido e deve estar no intervalo de 0 a 10.");
                }
            }
        }
    }
    
    public void estadoTelevisao(){
        if(estado == true){
            System.out.println("A TV está ligada.");
        }
        else{
            System.out.println("A TV está desligada.");
        }
    }
    
    
    
}
