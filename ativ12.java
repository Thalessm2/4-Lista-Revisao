package Lista4;

import java.util.Scanner;

public class ativ12 {
    public static void main(String[] args) {
        Scanner goku = new Scanner(System.in);
        int preco;
        System.out.println("qual o valor do produto?");
        System.out.println(("digite 1 para pagar a vista 10% desc"));
        System.out.println("digite 2 para pagar no cartão com desconto de 5%");
        System.out.println("digite 3 para pagar 2x preço normal");
        preco= goku.nextInt();
        if (preco==1){
            System.out.println(preco*0.1);}
        else if (preco==2){
            System.out.println(preco*0.5);}
        else if (preco==3){
            System.out.println(preco*2);}
        else System.out.println("numero invalido");
        }
    }

