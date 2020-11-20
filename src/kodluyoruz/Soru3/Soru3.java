package kodluyoruz.Soru3;

import java.util.ArrayList;

public class Soru3 {
    public static void main(String[] args) {

        int[] array = new int[10];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]+" ");
        }
        
        System.out.println("\nTekrar eden sayılar");
        ArrayList<Integer> temp= new ArrayList();
        int counter=0;

        for(int i = 0;i< array.length;i++ ){
            for (int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    counter ++;
                }
            }if (counter>=1){
                if(!temp.contains(array[i])){
                    temp.add(array[i]);
                }
            }
            counter=0;
        }
        for (int a : temp) {
            System.out.print(a+" ");
        }
    }
}
