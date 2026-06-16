package br.com.alura.praticandojava.variaveisetipos;

public class Exercicio10 {
    static void main(String[] args) {

        //Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o combustível disponível no tanque. Para isso, você precisa considerar:
        //
        //O consumo médio do veículo (km/l)
        //A capacidade total do tanque de combustível (litros)
        //A quantidade de combustível disponível no momento (litros)
        //A distância da viagem planejada (km)
        //Com essas informações, o programa deverá calcular:
        //
        //A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
        //A autonomia atual, baseada na quantidade de combustível disponível.
        //Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.

        double consumoMedioVeiculo = 12.5;
        double capacidadeDoTanque = 50;
        double combustivelDisponivel = 20;
        double distanciaViagem = 300;

        double autonomiaMaxima = consumoMedioVeiculo * capacidadeDoTanque;
        double autonomiaAtual = consumoMedioVeiculo * combustivelDisponivel;

        System.out.printf("Autonomia Máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);
        System.out.println("Distância da viagem planejada " + distanciaViagem);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem abastecer!");
        } else {
            System.out.println("Você não conseguirá completar a viagem. Abasteça o tanque.");
        }
    }
}
