package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class Intervalo {
    static void main(String[] args) {
        //Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não. 1000 a 5000 reais
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor desejado: ");
        int valorDesejado = input.nextInt();
        if (valorDesejado >= 1000 && valorDesejado <= 5000) {
            System.out.printf("O valor de R$%d está disponível a você.", valorDesejado);
        } else {
            System.out.printf("O valor de R$%d não está disponível a você", valorDesejado);
        }
        input.close();
    }
}
