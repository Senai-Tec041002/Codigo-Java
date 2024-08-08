package contabancaria;

import contabancaria.conta.Conta;
import contabancaria.operacoes.OperacoesConta;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Conta conta = new Conta();
        OperacoesConta operacoes = new OperacoesConta(conta);
        int opcao = 0;

        do {
            System.out.println("1- Cadastrar Conta");
            System.out.println("2- Consultar Conta");
            System.out.println("3- Sacar saldo");
            System.out.println("4- Depositar saldo");
            System.out.println("5- Mostrar rendimento");
            System.out.println("6- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = read.nextInt();

            switch(opcao) {
                case 1 -> conta.cadastrarConta();
                case 2 -> conta.mostrarConta();
                case 3 -> operacoes.sacarSaldo();
                case 4 -> operacoes.depositar();
                case 5 -> System.out.println("Rendimento: " + operacoes.calcularRendimento() + " Reais mensal!");
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcao != 6);
        read.close();
    }
}
