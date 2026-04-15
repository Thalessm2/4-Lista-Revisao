package atividades.lista4;

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n;
        n = sc.nextInt();
        if (n % 7 == 0) {
            System.out.println("multiplo de 7");
        } else if (n % 11 == 0) {
            System.out.println("multiplo de 11");

        } else System.out.println("não é multiplo de 11 ou 74");
    }
}
