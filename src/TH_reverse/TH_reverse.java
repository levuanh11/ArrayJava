package TH_reverse;

public class TH_reverse {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2};
        int[] arr = new int[array.length];

//        for (int i =0 ; i < array.length ; i++){
//            System.out.print(array[i]);
//        }
        for (int i = 0; i< arr.length / 2 ; i++){
            int temp = array[i];
            array[i] = array[array.length -1-i];
            array[array.length -1-i] = temp;
//            System.out.println(array[i]);
        }
        for (int i = 0 ; i < array.length ; i++) {
            arr[i] = array[i];
            System.out.print(arr[i] + " ");
       }
    }
}
