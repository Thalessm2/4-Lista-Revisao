package Lista4;

import java.util.Scanner;

public class ativ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado;
        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Operador inválido!");
        }
        scanner.close();
    }
}