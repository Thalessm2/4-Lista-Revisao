package listas;

import java.util.Scanner;

public class atv15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu dia e mes de nascimento e veja se é do signo de áries");
        int dia;
        int mes;
        dia = sc.nextInt();
        mes = sc.nextInt();
        if ((dia >= 21) && (dia <= 31) && (mes == 3) || (dia <= 19) && (dia >= 1) && (mes == 4)) {
            System.out.println("Seu signo é de áries");
        } else {
            System.out.println("Data invalida para ser do signo de áries");
        }
    }
}