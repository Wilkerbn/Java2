
package aula05_excontabanco;


public class Aula05_ExContaBanco {


    public static void main(String[] args) {
       ContaBanco p1= new ContaBanco();
       p1.setNumConta(111111);
       p1.setDono("Wilker");
       p1.abrirConta("cc");
       p1.depositar(300);
       p1.estadoAtual();    
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(222222);
       p2.setDono("Leidiane");
       p2.abrirConta("cp");
       p2.depositar(500);
       p2.sacar(100);
       p2.estadoAtual();
    }
    
}
