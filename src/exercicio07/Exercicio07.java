package exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor lógico (true/false): ");
        boolean v1 = sc.nextBoolean();
        System.out.print("Digite o segundo valor lógico (true/false): ");
        boolean v2 = sc.nextBoolean();

        if (v1 && v2) {
            System.out.println("Os dois valores são verdadeiros.");
        } else if (!v1 && !v2) {
            System.out.println("Os dois valores são falsos.");
        } else if (!v1 && v2) {
            System.out.println("O primeiro valor é falso e o segundo valor é verdadeiro.");
        } else {
            System.out.println("O primeiro valor é verdadeiro e o segundo valor é falso.");
        }

        sc.close();

        }
    }
