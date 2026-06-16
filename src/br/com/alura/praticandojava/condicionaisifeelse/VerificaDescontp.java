package br.com.alura.praticandojava.condicionaisifeelse;

import java.util.Scanner;

public class VerificaDescontp {
    //Crie um programa que receba o valor da compra e exiba uma mensagem informando se o desconto foi aplicado ou não.
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorDoDesconto;

        System.out.println("Digite o valor da compra:");
        double valorDaCompra = input.nextInt();

        if (valorDaCompra >= 100) {
            valorDoDesconto = ((valorDaCompra * 10) / 100);
            System.out.println("Desconto de 10% aplicado.\nNovo valor com desconto: R$ " + (valorDaCompra - valorDoDesconto));
        } else {
            System.out.println("Valor da Compra: " + valorDaCompra);
        }
        input.close();
    }
}
