package Shop;

public class Item {
    private int quantidadeProduto;
    private Produto produto;

    public Item(int quantidadeProduto, Produto produto) {
        this.quantidadeProduto = quantidadeProduto;
        this.produto = produto;
    }

    public int getQuantidadeProduto() {
        return this.quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
