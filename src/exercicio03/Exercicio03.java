package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do número A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor do número B: ");
        int b = sc.nextInt();
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("Valor de C: " + c);

        sc.close();
    }
}
