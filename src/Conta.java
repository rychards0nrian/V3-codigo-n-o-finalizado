public class Conta {
    private int numero;
    private float saldo;
    private int senha;
   
    //CONSTRUCTOR
    public Conta(int numero, float saldo, int senha){
        this.numero = numero;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    //GETTERS AND SETTERS
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    //Construtores
    public void depositar(float valor){
        if(valor > 0){
            this.saldo = valor; 
            System.out.format("\n Voce depositou: %f \n Seu saldo atual é de:", valor, saldo);
        }else{
            System.out.println("Valor não pode ser depositado");
        }
    }  
    
    public void sacar(float valor, int senha){
        if(valor > saldo){
            System.out.format("\n Operaçao negada!!!");
        }else{
            this.setSaldo(saldo-valor) ;
        }

    }

    public float verificarSaldo(int senha){
        if(this.senha == senha){
            System.out.format("Operação realizada com sucesso.\n Seu saldo atual é de:%f", saldo);
        }else{
            System.out.println("Acesso negado");
        }
        return saldo;

    } 



    
}
