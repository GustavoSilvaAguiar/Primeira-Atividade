package Pessoa;
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String email, String cnpj, String nomeFantasia) {
        super(nome, email);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    // GET
    public String getCNPJ() {
        return this.cnpj;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    // SET
    public void setCNPJ(String novoCNPJ) {
        this.cnpj = novoCNPJ;
    }

    public void setNomeFantasia(String novoNomeFantasia) {
        this.nomeFantasia = novoNomeFantasia;
    }

}
