
package aula02_ex01;


public class Alarme {
    String periodo;
    String som;
    int volume;
    boolean bateria;
   
    void Despertar(){
        if(this.bateria==true&&this.volume>0){
            System.out.println("Estou despertando!!!");
        }
            else if(this.bateria==true&&this.volume<=0){
                    System.out.println("Estou despertando no vibracall!!!");
                    }
        else{
            System.out.println("Estou sem bateria!!!");
        }
            
    }
    void Ligado(){
        this.bateria = true;
    }
    void Desligado(){
        this.bateria = false;
    }
    void status(){
        System.out.println("Periodo "+this.periodo);
        System.out.println("Música "+this.som);
        System.out.println("Volume "+this.volume);
        System.out.println("Está com bateria? "+this.bateria);
    }
    
}
