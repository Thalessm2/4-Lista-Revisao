package Lista4;

import java.util.Scanner;

public class ativ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 4 digitos: ");
        int n1 = sc.nextInt();
        int n2, n3, n4, n5;
        ;
        int conta1, conta2, conta3;
        ;
        int nw1, nw2, nw3, nw4;
        conta1 = n1 / 100;
        nw1 = conta1;
        conta2 = conta1 * 100;
        n2 = n1 - conta2;
        conta3 = conta1 + n2;
        if (conta3 * conta3 == n1) {
            System.out.println("É magico");
        } else {
            System.out.println("Não é magico");
        }


    }
}
