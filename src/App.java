import java.util.Scanner;

import Pessoa.Cliente;
import Pessoa.PessoaFisica;
import Pessoa.PessoaJuridica;
import Shop.*;

public class App {
    public static void main(String[] args) {

        Produto produto = new Produto("abobrinha", "verde");
        Produto produto2 = new Produto("abobrinha2", "verde2");

        Item item1 = new Item(2, produto);
        Item item2 = new Item(4, produto2);
        Item[] itens = { item1, item2 };

        Cliente pessoa;

        Scanner scanner = new Scanner(System.in);
        Helpers help = new Helpers();

        System.out.println("Bem vindo ao sistema de cadastro de Clientes ");

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        String cpfCNPJ;
        do {
            System.out.print("Digite o seu cpf ou cnpj: ");
            cpfCNPJ = help.cleanCPForCNPJ(scanner.nextLine());
        } while (help.validateCNPJOrCPFBoolean(cpfCNPJ));

        System.out.print("Digite o seu e-mail: ");
        String emailCliente = scanner.nextLine();

        // Inicializar a determinada classe baseado nos dados recebidos.
        if (help.cpfOrCnpj(cpfCNPJ)) {
            pessoa = new PessoaFisica(nomeCliente, emailCliente, cpfCNPJ);

            System.out.println("\nDados cadastrados: \n");
            System.out.println("Nome: " + pessoa.getNome() + "\nCPF: " + ((PessoaFisica) pessoa).getCPF() + "\nE-mail: "
                    + ((PessoaFisica) pessoa).getEmail());

            System.out.println(
                    "Cliente cadastrado, gostaria de cadastrar itens a sua lista? Se sim, digite os itens, para encerrar digite n");

            ((PessoaFisica) pessoa).listaCompra();

            System.out.println("Lista de compras: " + ((PessoaFisica) pessoa).getListaCompra());

            Pedido pedido = new Pedido(((PessoaFisica) pessoa), itens);

            System.out.println(pedido);

        } else {
            System.out.print("Digite o nome fantasia: ");
            String nomeFantasia = scanner.nextLine();

            pessoa = new PessoaJuridica(nomeCliente, emailCliente, cpfCNPJ, nomeFantasia);

            System.out.println("\nDados cadastrados: \n");
            System.out.println("Nome " + pessoa.getNome() + "\nCNPJ: " + ((PessoaJuridica) pessoa).getCNPJ()
                    + "\nFE-mail: " + ((PessoaJuridica) pessoa).getEmail() + "\nNome Fantasia: "
                    + ((PessoaJuridica) pessoa).getNomeFantasia());

            System.out.println(
                    "Cliente cadastrado, gostaria de cadastrar itens a sua lista? Se sim, digite os itens, para encerrar digite n");

            ((PessoaJuridica) pessoa).listaCompra();

            System.out.println("Lista de compras: " + ((PessoaJuridica) pessoa).getListaCompra());
        }

        scanner.close();
    }
}
