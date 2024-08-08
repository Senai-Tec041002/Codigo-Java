package contabancaria.conta;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Conta {
    private Random gerador = new Random();
    private Scanner read = new Scanner(System.in);
    private String nome;
    private int numero;
    private int agencia;
    private LocalDate dataAbertura;
    private double saldo;

    public Conta() {
        this.saldo = 0.0;
        this.dataAbertura = LocalDate.now();
    }

    public Conta(String nome, int numero, int agencia) {
        this();
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
    }

        public void cadastrarConta() {
            gerarAgenciaConta();
            System.out.println("Informe seu nome: ");
            this.nome = read.nextLine();
        }

        public void mostrarConta(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Número: " + this.numero);
            System.out.println("Agência: " + this.agencia);
            System.out.println("Data de Abertura: " + this.dataAbertura);
            System.out.println("Saldo: " + this.saldo);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getAgencia() {
            return agencia;
        }

        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }

        public LocalDate getDataAbertura() {
            return dataAbertura;
        }

        public void setDataAbertura(LocalDate dataAbertura) {
            this.dataAbertura = dataAbertura;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        private void gerarAgenciaConta(){
            this.agencia = gerador.nextInt(1000) + 1;
            this.numero = gerador.nextInt(100000) + 1;
        }
    }


