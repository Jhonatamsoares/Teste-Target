import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        //solicitando para o usuário um número
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        //variável para armazenar anterior
        int anterior = 0;
        //variável para armazenar o atual
        int atual = 1;
        //variável para armazenar a soma
        int soma = 0;

        while(atual < numero) {
            //a soma recebe o valor do atual mais o anterior
            soma = anterior + atual;
            //o valor do anterior passa a ser o valor atual
            anterior = atual;
            //o valor atual recebe o valor da soma
            atual = soma;
        }

        //verificando o resultado
        if(numero == atual) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci!");
        }

    }

}