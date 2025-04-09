package exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();

        int primeiro, segundo, terceiro;

        if (a > b) {
            if (a > c) {
                primeiro = a;
                if (b > c) {
                    segundo = b;
                    terceiro = c;
                } else {
                    segundo = c;
                    terceiro = b;
                }
            } else {
                primeiro = c;
                segundo = a;
                terceiro = b;
            }
        } else {
            if (b > c) {
                primeiro = b;
                if (a > c) {
                    segundo = a;
                    terceiro = c;
                } else {
                    segundo = c;
                    terceiro = a;
                }
            } else {
                primeiro = c;
                segundo = b;
                terceiro = a;
            }
        }

        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);

        sc.close();
    }
}
