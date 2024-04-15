package Shop;

import java.util.Arrays;

import Pessoa.*;

public class Pedido {

    private static int numeroPedido = 0;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private Item[] item;

    public Pedido(PessoaFisica pessoaFisica, Item[] item) {
        this.pessoaFisica = pessoaFisica;
        this.item = item;
    }

    public Pedido(PessoaJuridica pessoaJuridica, Item[] item) {
        this.pessoaJuridica = pessoaJuridica;
        this.item = item;
    }

    public static int getNumeroPedido() {
        return numeroPedido;
    }

    public PessoaFisica getPessoaFisica() {
        return this.pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return this.pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public Item[] getItem() {
        return this.item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Pedido [pessoaFisica=" + pessoaFisica + ", pessoaJuridica=" + pessoaJuridica + ", item="
                + Arrays.toString(item) + "]";
    }

}
