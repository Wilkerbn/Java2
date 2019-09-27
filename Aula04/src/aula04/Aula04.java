
package aula04;


public class Aula04 {

  
    public static void main(String[] args) {
       Caneta c1 = new Caneta("NIC",0.1f,"Amarela");
       //c1.setModelo("BIC");
       //c1.setPonta(0.5f);
       c1.status();
       Caneta c2= new Caneta("TIC",1.5f,"Laranja");
       c2.status();
       
        
        System.out.println("Tenho uma caneta " +c1.getModelo()+ " de ponta "+c1.getPonta());
    }
    
}
