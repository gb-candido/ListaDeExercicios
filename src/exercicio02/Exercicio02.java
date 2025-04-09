package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        System.out.print("O número " + n + " é ");

        if (n % 2 == 0) {
            System.out.print("par ");
        } else {
            System.out.print("ímpar ");
        }

        if (n > 0) {
            System.out.print("e positivo.");
        } else if (n == 0) {
            System.out.print("e neutro.");
        } else {
            System.out.print("e negativo.");
        }


        sc.close();
    }
}
