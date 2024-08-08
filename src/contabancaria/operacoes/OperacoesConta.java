package contabancaria.operacoes;

import contabancaria.conta.Conta;
import java.util.Scanner;

public class OperacoesConta {
    private Conta conta;
    private Scanner read = new Scanner(System.in);

    public OperacoesConta(Conta conta) {
        this.conta = conta;
    }

    public void depositar() {
        System.out.println("Informe o valor que deseja depositar");
        double valor = read.nextDouble();
        if (valor <= 0) {
            System.out.println("O valor deve ser positivo");
        } else {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso");
        }
    }

    public void sacarSaldo() {
        System.out.println("Informe o valor que deseja sacar");
        double valor = read.nextDouble();
        if (valor <= 0) {
            System.out.println("O valor de saque deve ser positivo.");
        } else if (ePossivelSacar(valor)) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!");
        }
    }

    public Double calcularRendimento() {
        return conta.getSaldo() * 0.10;
    }

    private boolean ePossivelSacar(double valor) {
        return conta.getSaldo() >= valor;
    }
}
