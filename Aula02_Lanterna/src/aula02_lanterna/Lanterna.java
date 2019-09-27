
package aula02_lanterna;

public class Lanterna {
    String CordaLampada;
    int Pilha;
    int carga;
    String Modelo;
    boolean Botão;
   
    void Acender(){
        if(this.Pilha>1&&this.carga>0&&this.Botão==true){
            System.out.println("Lanterna Ligada");
        }else{
            System.out.println("Faltando Pilha!!");
        }
    }
    
    void Liga(){
        this.Botão=true;
        }

    void Desliga(){
        this.Botão=false;
    }
    void status(){
        System.out.println("A cor da Lâmpada é "+this.CordaLampada);
        System.out.println("A quantidade de pilha é "+this.Pilha);
        System.out.println("A carga das pilhas estão em "+this.carga+"%");
        System.out.println("O modelo da lanterna é "+this.Modelo);
        System.out.println("O botão está ligado? "+this.Botão);
    }
}

