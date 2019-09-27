package aula02;

public class Caneta {
    public String Modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void rabiscar(){
 if(this.tampada==true){
     System.out.println("Não posso rabiscar");
 }else{
     System.out.println("Estou rabiscando");
 }
}
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
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
