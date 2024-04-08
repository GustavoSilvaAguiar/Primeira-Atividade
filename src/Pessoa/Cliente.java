package Pessoa;
import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private String email;
    private String[] listaCompras;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Get
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getListaCompra() {
        String returnString = "";
        if (this.listaCompras != null) {
            for (int i = 0; i < this.listaCompras.length; i++) {
                returnString = i + 1 == this.listaCompras.length ? returnString + this.listaCompras[i]
                        : returnString + this.listaCompras[i] + ", ";
            }
        }

        return returnString;
    }

    // Set
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    // Methods
    public void addListaCompra(String novoItem) {
        // Verificar se a lista de compras é nula
        if (this.listaCompras == null) {
            this.listaCompras = new String[] { novoItem };
        } else {
            String[] novaLista = new String[this.listaCompras.length + 1];
            System.arraycopy(this.listaCompras, 0, novaLista, 0, this.listaCompras.length);
            novaLista[this.listaCompras.length] = novoItem;
            this.listaCompras = novaLista;
        }
    }

    public void listaCompra() {
        String lista;
        do {
            lista = scanner.nextLine();
            if (!lista.equals("n")) {
                addListaCompra(lista);
            }
        } while (!lista.equals("n"));
    }

}
