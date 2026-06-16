package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class ComparacaoNumeros {
    static void main(String[] args) {
        //Compare dois números
        Scanner input = new Scanner(System.in);

        System.out.println("******** Comparador de números ********");
        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("\nAgora digite o segundo número: ");
        int numero2 = input.nextInt();

        if (numero1 == numero2) {
            System.out.printf("O número %d é igual ao número %d\n", numero1, numero2);
        } else if (numero1 > numero2) {
            System.out.printf("O número %d é maior que o número %d\n", numero1, numero2);
        } else {
            System.out.printf("O número %d é maior que o número %d\n", numero1, numero2);
        }
        input.close();
    }
}
