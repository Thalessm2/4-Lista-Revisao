package atividades.lista4;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu peso e altura");
        double peso;
        double altura;
        peso = sc.nextDouble();
        altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);


    }
}
