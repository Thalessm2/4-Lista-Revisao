package atividades.lista4;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Coloque sua idade:");
        idade = sc.nextInt();
        if ((idade >= 5) && (idade <= 7)) {
            System.out.println("INFANTIL");
        } else if ((idade >= 8) && (idade <= 17)) {
            System.out.println("JUVENIL");
        } else if (idade >= 18) {
            System.out.println("SENIOR");
        }
    }
}

