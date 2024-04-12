import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Lucas Eduardo";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 1;
        int valorRecebido = 0;
        int valorTransferido = 0;
        Scanner leitura = new Scanner(System.in);
        String operacoes = """
                Operações
                
                1 - Consultar saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                
                Digite a opção desejada:
                """;
        System.out.println(String.format("***********************************\nNome: %s\n" +
                "Saldo da conta: R$ %.2f\nTipo da conta: %s\n***********************************\n\n", nome, saldo, tipoConta));
        System.out.println(operacoes);
        while(opcao >= 1 && opcao <= 4){
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println(String.format("Seu saldo atual é de R$ %.2f", saldo));
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                valorRecebido = leitura.nextInt();
                saldo += valorRecebido;
                System.out.println(String.format("Saldo atualizado: R$ %.2f", saldo));
                
            } else if (opcao == 3) {
                System.out.println("Informe o valor a ser transferido:");
                valorTransferido = leitura.nextInt();
                saldo -= valorTransferido;
                System.out.println(String.format("Saldo atualizado: R$ %.2f", saldo));

            } else if (opcao == 4) {
                break;

            }
            System.out.println(operacoes);
        }


    }
}