package XoaPhanTu;

import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array={1,2,3,4,5,5,6,5,7,8,9};
        int number = scanner.nextInt();


        int count = 0;
        for ( int i : array){
            if (i == number){
                count++;
            }
        }

        int [] arr1 = new int[array.length - count];
        int a = 0 ;
        for ( int i =0 ; i<array.length ; i++){
            if ( array[i] != number) {
                arr1[a] = array[i];
                a++;
            }
        }
        disPlay(arr1);

    }
     public static void disPlay(int arr[]) {
        for (int element : arr) {
            System.out.print(element + ";");
        }
     }
}
