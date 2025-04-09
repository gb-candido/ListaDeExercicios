package exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();

        System.out.println("Valor reajustado: " + String.format("%.2f", valor * 1.05));

        sc.close();
    }
}
