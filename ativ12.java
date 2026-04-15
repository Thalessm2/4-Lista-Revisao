package Lista4;

import java.util.Scanner;

public class ativ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int preco,num;
        System.out.println(("digite 1 para pagar a vista 10% desc"));
        System.out.println("digite 2 para pagar no cartão com desconto de 5%");
        System.out.println("digite 3 para pagar 2x preço normal");
        preco= sc.nextInt();
        System.out.println("qual o valor do produto?");
        num =sc.nextInt();
        if (preco==1){
            System.out.println(num*0.9);}
        else if (preco==2){
            System.out.println(num*0.95);}
        else if (preco==3){
            System.out.println(num/2);}
        else System.out.println("numero invalido");
        sc.close()
        }
    }

