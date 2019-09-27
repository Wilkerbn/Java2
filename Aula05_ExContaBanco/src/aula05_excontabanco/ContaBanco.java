
package aula05_excontabanco;


public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    
    //Métodos especiais (Construtor)
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    //Métodos personalizados    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("cc".equals(t)){
            this.setSaldo(50);
        }else if ("cp".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }    
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta com dinheiro! Não posso encerrar.");
        }else if (this.getSaldo() <0){
            System.out.println("Conta negativa! Quite a dívida primeiro!");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
               
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(getSaldo()+v);
            System.out.println("Deposito realizado com sucesso na conta de "+this.getDono());
        }else{
            System.out.println("Impossível depositar! Conta fechada.");
        }
    }
    public void sacar(double v){
        if(getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }
            else{
                System.out.println("Saldo Insuficiente para saque.");
            }
        }
        else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
            
        
    }
    public void pagarMensal(){
        int v=0;
        if("cc".equals(this.getTipo())){
            v=12;
        } else if("cp".equals(this.getTipo())){
            v=20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por" +this.getDono());
        }
        else{
            System.out.println("Impossível pagar mensalidade com conta fechada!");
        }
    }

  
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
        
    
        
    
}
