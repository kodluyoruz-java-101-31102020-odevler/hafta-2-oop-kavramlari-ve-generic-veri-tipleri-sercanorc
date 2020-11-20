package kodluyoruz.Soru1;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int satir; System.out.print("Satır giriniz : ");
        satir= input.nextInt();
        int sutun; System.out.print("Sütun giriniz : ");
        sutun= input.nextInt();
        int[][] matris = new int[satir][sutun];
        int value=1;
        for(int i=0; i <satir; i++) {

            for(int j=0; j<sutun; j++) {

                matris[i][j]=value;
                value++;
            }
        }
        System.out.println("Matris");
        for(int i=0; i <satir; i++) {

            for(int j=0; j<sutun; j++) {

               System.out.print(matris[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("Spiral Matris");

        for(int i=1; i<=satir*sutun; i++){
            System.out.print(i+"-");
        }

        System.out.println("\neleman erişimli spiral matris");
        for(int i=0; i <satir; i++) {

            for(int j=0; j<sutun; j++) {

                System.out.print(matris[i][j]+"-");

            }
        }


    }
}
