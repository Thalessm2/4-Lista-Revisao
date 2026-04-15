package atividades.lista4;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite 3 numeros");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if (n1 + n2 == n3) {
            System.out.println("É triangulo");

        } else if (n2 + n3 == n1) {
            System.out.println("É triangulo");
        } else if (n3 + n1 == n2) {
            System.out.println("É triangulo");
        } else {
            System.out.println("Não é triangulo");
        }
    }
}
