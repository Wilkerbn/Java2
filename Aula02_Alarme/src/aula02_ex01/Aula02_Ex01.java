
package aula02_ex01;

public class Aula02_Ex01 {
  
    public static void main(String[] args) {
        Alarme a1 = new Alarme();
        a1.periodo="Manhã";
        a1.som="Mirrors - Justim Timberlake";
        a1.volume=100;
        a1.Desligado();
        a1.Despertar();
        a1.status();
    }
    
}
