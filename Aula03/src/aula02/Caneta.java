package aula02;

public class Caneta {
    String Modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
 if(this.tampada==true){
     System.out.println("Não posso rabiscar");
 }else{
     System.out.println("Estou rabiscando");
 }
}
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void status(){
        System.out.println("Modelo "+this.Modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Ponta"+this.ponta);
        System.out.println("Carga " +this.carga);
        System.out.println("Está tampada? "+this.tampada);
                    
    }


}
