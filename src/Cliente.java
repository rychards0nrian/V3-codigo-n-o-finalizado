public class Cliente {
    private String nome;
    private long CPF;
    private Conta conta = new Conta(0,0,0);
    
    //CONSTRUCTOR
    public Cliente(String nome, int CPF, Conta conta){
        this.nome = nome;
        this.CPF = CPF;
        this.conta = conta; 
    }
    

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;

    }

    public long getCpf() {
        return CPF;
    }

    public void setCpf(long CPF) {
        this.CPF = CPF;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
