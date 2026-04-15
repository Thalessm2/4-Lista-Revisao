package atividades.lista4;

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero");
        n = sc.nextInt();
        if (n < 100) {
            System.out.println("menor que o intervalo");

        } else if (n > 200) {
            System.out.println("maior que o intervalo");

        } else System.out.println("entre o intervalo");
    }
}