import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import  java.util.Scanner;


public class arrayClose {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Bir Sayi Gir : ");
        n = inp.nextInt();
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        for (int i : arr) {
         if (n < i) {

                System.out.println(n + " en yakin buyuk deger : " + i);

            break;

            }



        }

        for(int j=arr.length-1;j>=0;j--){



            if (arr[j]<n){
                System.out.println(n +" en yakin kucuk deger : "+ arr[j]);
              break;
            }


        }


    }
}


