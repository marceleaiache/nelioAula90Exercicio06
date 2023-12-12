package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            System.out.println("Quantos valores vai ter cada vetor?");
            if (sc.hasNextInt()) {
                n =sc.nextInt();
                break;
            }
            else {
                System.out.println("O número precisa ser inteiro.");
                System.out.println("Por favor, digite a quantidade de valores que cada vetor terá: ");
                sc.nextInt();
            }
        }

        double[] a = new double[n];
        double[] b = new double[n];
        double[] c = new double[n];

        for (int i=0; i<a.length; i++) {
            System.out.println("Digite os valores do vetor A: ");
            a[i] = sc.nextDouble();
        }

        for (int i=0; i<b.length; i++) {
            System.out.println("Digite os valores do vetor B: ");
            b[i] = sc.nextDouble();
        }

        for (int i=0; i<c.length; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i=0; i<c.length; i++) {
            System.out.println(c[i]);
        }

        sc.close();
    }
}
