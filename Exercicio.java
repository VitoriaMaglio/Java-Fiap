import java.util.Scanner;

public class Exercicio {
    /* Exercício; Faça um programa que aceite um número (multiplo de 10) e que retorne quantas vezes as cédulas de 50,20,10 são divisíveis pelo número.
exemplo: 180
    Primeiro vc tem que dividir 180 e dividir por 50 para saber quantas vezes/ cédulas tem de 50 dentroo de 180
    Depois para continuar, v precisa do resto dessa divisão
     */


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor, notas50, notas20, notas10;
        System.out.println("Informe o valor a ser sacado: R$ ");
        valor = leitor.nextInt();
        notas50 = valor / 50;
        System.out.println("Notas de R$ 50: " + notas50);
        valor = valor % 50; //resto da dívida
        notas20 = valor/ 20;
        System.out.println("Notas de R$ 20: " + notas20);
        valor = valor % 20;
        notas10 = valor / 10 ;
        System.out.println("Notas de R$ 10: " + notas10);


    }
}
