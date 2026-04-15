package listas;

import java.util.Scanner;

public class atv14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salario;
        salario = sc.nextDouble();
        if (salario <= 2000) {
            System.out.println("isento de imposto");
        } else if (salario <= 5000) {
            System.out.println(salario * 0.10+" de imposto");

        } else {
            System.out.println(salario * 0.20+" de imposto");
    }
}
}