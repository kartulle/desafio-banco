import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;
import cliente.Cliente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente dados = new Cliente();
        Conta cc = new ContaCorrente(dados);
        Conta poupanca = new ContaPoupanca(dados);
        System.out.println("Como você quer ser chamado?");
        String nome = scanner.nextLine();
        dados.setNome(nome);
        System.out.println("====== BEM-VINDO, " + nome + "! ======");

        while(true){
            System.out.println("=== Escolha uma opção === \n 1. Depositar \n 2. Extrato \n 3. Sacar \n 4. Transferir \n 0. Sair");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor de depósito");
                    double valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
                    System.out.println("!!! Operação Concluída !!!");
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                case 2:
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                case 3:
                    System.out.println("Você tem: " + cc.getSaldo() + " na sua conta corrente");
                    System.out.println("Quanto quer sacar?");
                    double valorSaque = scanner.nextDouble();
                    cc.sacar(valorSaque);
                    System.out.println("Você tem: R$" + cc.getSaldo() + " na sua conta corrente");
                    break;
                case 4:
                    System.out.println("Digite o valor para transferência");
                    double valorTransferencia = scanner.nextDouble();
                    cc.transferir(valorTransferencia, poupanca);
                    poupanca.imprimirExtrato();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
}