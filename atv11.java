package atividades.lista4;

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero");
        n = sc.nextInt();
        if ((n % 2 == 0) && (n < 100)) {
            System.out.println("par e menor que 100");
        } else if ((n % 2 != 0) && (n > 100)){
            System.out.println("impar e maior que 100");
        } else {
            System.out.println("numero invalido");
        }
    }
}