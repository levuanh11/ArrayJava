package Find_Min;

public class Find_Min {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1} ;
        int min = array[0];
        for (int i=1; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
