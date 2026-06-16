public class Exercicio9 {
    public static void main(String[] args) {
        //Identificar e corrigir o erro de escopo de variáveis no código.
        //Garantir que o programa exiba a mensagem correta com base na idade da pessoa, no código abaixo a saída será Você é menor de idade

        int idade = 18;
        String mensagem;
        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }
        System.out.println(mensagem);
    }
}