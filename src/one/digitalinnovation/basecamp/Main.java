package one.digitalinnovation.basecamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;
        System.out.print("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = scan.nextDouble();

        double soma = Calculadora.somar(a, b);
        double subtracao = Calculadora.subtrair(a, b);
        double divisao = Calculadora.dividir(a, b);
        double multiplicacao = Calculadora.multiplicar(a, b);

        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("DIVISÃO: " + divisao);
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao);

        System.out.print("Digite seu Nome: ");
        String nome = scan.next();


        Mensagem.mensagem(nome);

        System.out.println("");
        Boolean valid = false;
        int tempo = 0;
        while (!valid) {
            System.out.print("Informe o tempo em anos para pagar o empréstimo (mínimo 5 anos): ");
            tempo = scan.nextInt();
            valid = Emprestimo.validaTempo(tempo);
        }
        System.out.print("Digite o valor a ser emprestado: ");
        double valorEmprestimo = scan.nextDouble();

        System.out.println("");
        Emprestimo.calculaEmprestimo(tempo, valorEmprestimo);


    }
}
