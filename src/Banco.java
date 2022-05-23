import java.util.ArrayList;
import java.util.List;

public class Banco{
    Conta conta ;
    private String nome;
    private int agencia;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();;
    private int senhaGerente;
    
    public Banco(String nome, int agencia, int senhaGerente){
        conta = new Conta(0,0,0);

        this.nome = "Banco ufma";

        this.agencia = 26034;

        this.senhaGerente = 123;
    }
    
    //GGETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
      public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getSenhaGerente() {
        return senhaGerente;
    }
    public void setSenhaGerente(int senhaGerente) {
        this.senhaGerente = senhaGerente;
    }

    
    //METHODS
     
    public void cadastrarCliente(Cliente c){
        this.clientes.add(c);
    }

    public void excluirCliente(long CPF){
        for(int i = 0; i < this.clientes.size(); i++){
            if(CPF == this.clientes.get(i).getCpf()){
                this.clientes.get(i).setNome(nome = null);
                this.clientes.get(i).setCpf(CPF = 0);
                this.clientes.get(i).setConta(conta = null);       
            }

        }
    }

    public void ListaCliente() {
        this.clientes = new ArrayList<Cliente>();
    }


    public void getAllCli(){
        for(int i = 0; i < this.clientes.size(); i++){
            System.out.println("\n REF DO CLIENTE "+ this.clientes.get(i) + " -- " + this.clientes.get(i).getNome() + "-- CPF: " + this.clientes.get(i).getCpf() + "-- CONTA: " + this.clientes.get(i).getConta());
        }
    }
}

