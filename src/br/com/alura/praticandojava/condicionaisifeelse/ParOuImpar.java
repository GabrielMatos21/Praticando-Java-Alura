package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        //Verificar se o número é par ou impar
        Scanner scanner = new Scanner(System.in);
        byte confirmacao = 1;

        System.out.println("Só digo a verdade");

        while (confirmacao == 1) {
            System.out.print("Digite um número e eu direi se é PAR ou IMPAR: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.printf("O número %d é par%n", numero);
            } else {
                System.out.printf("O número %d é impar%n", numero);
            }
            System.out.println("Quer tentar com outro número? Digite 1 para SIM ou 0 para NÃO");
            confirmacao = scanner.nextByte();
            while (confirmacao != 0 && confirmacao != 1) {
                System.out.println("Opção inválida. Acho que você digitou o número errado. \nTente novamente.");
                confirmacao = scanner.nextByte();
            }
        }
        scanner.close();
        System.out.println("Certo, até mais!");
    }
}