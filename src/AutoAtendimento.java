public class AutoAtendimento {
   // static Banco banco = new Banco();
    static Banco lc = new Banco("Banco Ufma", 26034, 0);

    public static void main(String[] args) throws Exception {

        String Rian = "rian";
        lc.cadastrarCliente(new Cliente("CLIENTE " + Rian, 2 ,null ));

        

        lc.getAllCli();
        
    }

    //METHODS
    public static boolean loginCliente(int numConta, int senha){
        if(lc.conta.getNumero() == numConta && lc.conta.getSenha() == senha){
            return true;
        }else{
            return false;
        }
    }

    public static boolean loginGerente(int numAgencia, int senha){
        if((lc.getAgencia() == numAgencia) &&(lc.getSenhaGerente() == senha)){
            System.out.println("Acesso concedido");
        }else{
            System.out.println("Acesso negado!!! Por favor digite seus dados novamente");
        }
        return true;
    }

    public static void gerenteCadastrarCliente(Cliente novo){
        lc.cadastrarCliente(novo);

    }

    public void gerenteExcluirCliente(long CPF){
        lc.excluirCliente(CPF);
    }

    public void clienteSacar(float valor, int senha){
        lc.conta.sacar(valor, senha);
    }

    public void clienteDepositar(float valor){
        lc.conta.depositar(valor);

    }

    public void clienteVerificarSaldo(int senha){
        lc.conta.verificarSaldo(senha);
    }




}
