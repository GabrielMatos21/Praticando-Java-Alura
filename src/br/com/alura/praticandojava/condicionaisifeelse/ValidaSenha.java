package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class ValidaSenha {
    static void main(String[] args) {
        //Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: batman,
        //verifique se o que o usuário digitou está correto ou não. O programa deve comparar a
        //tentativa com a senha correta e exibir se o acesso foi permitido ou negado.
        String senha = "batman";
        String senhaTentativa;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu senha: ");
        senhaTentativa = input.nextLine();
        if (senha.equals(senhaTentativa)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }

    }
}
