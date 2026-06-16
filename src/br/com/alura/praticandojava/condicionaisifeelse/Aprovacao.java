package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class Aprovacao {
    static void main(String[] args) {
        //Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.
        Scanner scanner = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, nota3 = 0;
        String nomeDoAluno;

        System.out.println("Digite o nome do aluno: ");
        nomeDoAluno = scanner.next();

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("O aluno %s teve a média de %f e está aprovado\n", nomeDoAluno, media);
        } else if (media < 7 && media >= 5) {
            System.out.printf("O aluno %s teve a média de %f e está de recuperação\n", nomeDoAluno, media);
        } else {
            System.out.printf("O aluno %s teve a média de %f e está reprovado\n", nomeDoAluno, media);
        }
        scanner.close();
    }
}
