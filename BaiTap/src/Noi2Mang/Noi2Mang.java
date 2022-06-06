package Noi2Mang;

public class Noi2Mang {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {7,8,9,0,1,2};
        int [] newArray = Noi2Mang.concat(arr1,arr2);
        for (int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]);
        }
    }
    public static int[] concat(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i > array1.length - 1) {
                newArray[i] = array2[i - array1.length];
            } else {
                newArray[i] = array1[i];
            }
        }
        return newArray;
    }

}

