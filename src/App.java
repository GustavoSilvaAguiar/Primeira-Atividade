import java.util.Scanner;

import Pessoa.PessoaFisica;
import Pessoa.PessoaJuridica;
import Shop.Pedido;

public class App {
    public static void main(String[] args) {

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
            PessoaFisica pessoaFisica = new PessoaFisica(nomeCliente, emailCliente, cpfCNPJ);

            System.out.println("\nDados cadastrados: \n");
            System.out.println("Nome: " + pessoaFisica.getNome() + "\nCPF: " + pessoaFisica.getCPF() + "\nE-mail: "
                    + pessoaFisica.getEmail());

            System.out.println(
                    "Cliente cadastrado, gostaria de cadastrar itens a sua lista? Se sim, digite os itens, para encerrar digite n");

            pessoaFisica.listaCompra();

            System.out.println("Lista de compras: " + pessoaFisica.getListaCompra());
        } else {
            System.out.print("Digite o nome fantasia: ");
            String nomeFantasia = scanner.nextLine();

            PessoaJuridica pessoaJuridica = new PessoaJuridica(nomeCliente, emailCliente, cpfCNPJ, nomeFantasia);

            System.out.println("\nDados cadastrados: \n");
            System.out.println("Nome " + pessoaJuridica.getNome() + "\nCNPJ: " + pessoaJuridica.getCNPJ()
                    + "\nFE-mail: " + pessoaJuridica.getEmail() + "\nNome Fantasia: "
                    + pessoaJuridica.getNomeFantasia());

            System.out.println(
                    "Cliente cadastrado, gostaria de cadastrar itens a sua lista? Se sim, digite os itens, para encerrar digite n");

            pessoaJuridica.listaCompra();

            System.out.println("Lista de compras: " + pessoaJuridica.getListaCompra());
        }

        scanner.close();
    }
}
