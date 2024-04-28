package Shop;

public class Produto {
    private int IdProduto;

    private String nomeProduto;
    private String descricaoProduto;

    public Produto(int idProduto, String nomeProduto, String descricaoProduto) {
        this.IdProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nomeProduto + ", descricaoProduto=" + descricaoProduto + "]";
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getIdProduto() {
        return this.IdProduto;
    }

    public void setIdProduto(int idProduto) {
        this.IdProduto = idProduto;
    }

}
