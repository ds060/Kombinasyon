package Kodluyoruz;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int a, b, c, fakt1 = 1, fakt2 = 1, fakt3 = 1;
double islem=0;

Scanner inp=new Scanner(System.in);

        System.out.println("İşlem yapmak istediğiniz ilk sayıyı giriniz:");
        a=inp.nextInt();

        System.out.println("İşlem yapmak istediğiniz ikinci sayıyı giriniz:");
        b=inp.nextInt();

        for (int i=1; i<=a; i++){
            fakt1*=i;
            }

        System.out.println(a+".faktoriyeli:" +fakt1);

        for (int j=1; j<=b; j++){
            fakt2 *=j;
        }
        System.out.println(b+ ".faktoriyeli:" +fakt2);

        c=a-b;
        for (int z=1; z<=c; z++){
            fakt3*=z;

        }
        System.out.println(c+ ".faktoriyeli:" +fakt3);

        islem=fakt1/(fakt2*fakt3);

                System.out.println("İşlemin sonucu:" +islem);

    }
}
