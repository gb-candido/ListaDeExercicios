package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = sc.nextDouble();
        System.out.print("Digite o valor do seu salário: R$ ");
        double salarioUsuario = sc.nextDouble();

        double calculoSalario = salarioUsuario / salarioMinimo;

        System.out.printf("Você recebe %.0f salários mínimos", calculoSalario);

        sc.close();
    }
}
