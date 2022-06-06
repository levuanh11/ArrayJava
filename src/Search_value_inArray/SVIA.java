package Search_value_inArray;

import java.util.Scanner;

public class SVIA {
    public static void main(String[] args) {
        String[] array = {"Vu","Linh","Khanh","Thang"};
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String VIPRO = scanner.nextLine();
        for ( int i=0 ; i< array.length ; i++){
            if (array[i] == VIPRO ) {
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println(VIPRO + "có trong danh sách");
        } else {
            System.out.println("idiot");
        }
    }
}
