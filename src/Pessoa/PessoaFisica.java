package Pessoa;
public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    // GET
    public String getCPF() {
        return this.cpf;
    }

    // SET
    public void setCPF(String novoCPF) {
        this.cpf = novoCPF;
    }
}
