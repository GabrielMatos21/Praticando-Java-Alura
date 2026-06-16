package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

        System.out.println("Verificação de triângulo");
        System.out.print("Digite o tamanho do primeiro lado: ");
        int a = input.nextInt();
        System.out.print("\nDigite o tamanho do segundo lado: ");
        int b = input.nextInt();
        System.out.println("\nDigite o tamanho do terceiro lado: ");
        int c = input.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados podem formar um triângulo!.");
        } else {
            System.out.println("Não é possível formar um triângulo.");
        } input.close();
    }
}
