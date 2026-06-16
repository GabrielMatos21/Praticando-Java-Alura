package br.com.alura.praticandojava.variaveisetipos;

public class Exercicio7 {
    static void main(String[] args) {
        //Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.
        int numero = 8;
        boolean isDivisivelPorDois;

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é impar.");
        }
    }
}
