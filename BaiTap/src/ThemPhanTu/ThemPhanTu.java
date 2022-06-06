package ThemPhanTu;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm");
        int N = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm");
        int index = scanner.nextInt();
        int [] arrayNew = new int[array.length + 1];
        for ( int i =0 ; i< index ; i++ ){
            arrayNew[i] = array[i];
        }
        for (int i = index; i < arrayNew.length ; i++){
           if (i != index){
               arrayNew[i] = array[i-1];
           } else {
               arrayNew[i] = N ;
           }
        }
        for (int i = 0 ; i< arrayNew.length ; i++){
            System.out.println(arrayNew[i]);
        }

    }
}
