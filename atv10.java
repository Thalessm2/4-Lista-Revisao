package atividades.lista4;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horario do começo e do fim do jogo");
        int n1, n2, conta;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        conta = n1 - n2;
        if (n1 <= n2) {
            System.out.println("o jogo terminou no outro dia");
        } else
            System.out.println("o jogo demorou " + conta + " hora/horas");


    }
}
