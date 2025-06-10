import java.util.Scanner;

public class GestorClientes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes = new Cliente[100];
        int totalClientes = 0;

        while (true) {
            System.out.println("\n=== Gestão de Assinaturas (MVP) ===");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Data de nascimento: ");
                    String nascimento = scanner.nextLine();

                    clientes[totalClientes] = new Cliente(nome, cpf, nascimento);
                    totalClientes++;
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Clientes ---");
                    for (int i = 0; i < totalClientes; i++) {
                        System.out.println("TOTAL: " + totalClientes);
                        System.out.println(clientes[i].getDados());
                    }
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        
    }
}