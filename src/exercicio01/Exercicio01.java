package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do número A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor do número B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor do número C: ");
        int c = sc.nextInt();

        int soma = a + b;

        if (soma < c) {
            System.out.println(soma + " < " + c);
        } else if (soma > c) {
            System.out.println(soma + " > " + c);
        } else {
            System.out.println(soma + " = " + c);
        }

        sc.close();
    }
}
