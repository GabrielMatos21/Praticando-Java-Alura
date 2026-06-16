package br.com.alura.praticandojava.variaveisetipos;

public class Exercicio1 {
    static void main(String[] args) {
        //Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é estudante, utilizando os tipos apropriados, e depois exiba os valores armazenados.
        String nome = "Gabriel";
        int idade = 20;
        double altura = 1.76;
        boolean isEstudante = false;

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
        if (isEstudante) {
            System.out.println("Estudante");
        } else {
            System.out.println("Não estudante");
        }
    }
}
