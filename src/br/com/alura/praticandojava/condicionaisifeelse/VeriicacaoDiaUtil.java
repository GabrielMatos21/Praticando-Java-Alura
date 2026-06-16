package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class VeriicacaoDiaUtil {
    static void main(String[] args) {
        //Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        int diaDigitado = input.nextInt();

        if (diaDigitado == 1 || diaDigitado == 7) {
            System.out.println("Fim de semana");
        } else {
            System.out.println("Dia útil");
        }
        input.close();
    }
}
