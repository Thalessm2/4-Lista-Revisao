package listas;

import java.util.Scanner;

public class atv16 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n;
        n = sc.nextInt();
        if ((n % 2 == 0) && (n % 3 == 0) && (n % 5 == 0)) {
            System.out.println("o numero é divisivel por 2, 3 e 5 ao mesmo tempo");
        } else {
            System.out.println("o numero não é divisivel por 2, 3 e 5 ao mesmo tempo");
        }
    }
}
