package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class ativ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escreva uma letra");
       char letra=sc.next().toLowerCase().charAt(0);
     if (letra>'a'&&letra<'z')
       if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u')){
            System.out.println("Essa letra e uma vogal");}
        else {
            System.out.println("Essa letra e uma consoante");}

    }
}
