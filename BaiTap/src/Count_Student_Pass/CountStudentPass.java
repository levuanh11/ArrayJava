package Count_Student_Pass;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int length;
        int [] array ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so luong sinh vien");
            length = scanner.nextInt();
            if (length > 30) {
                System.out.println("So luong toi da la 30");
            }

        }while (length > 30);


        array = new int[length];
        for (int i= 0 ; i<array.length ; i++){
            System.out.println("nhap diem cua tung hoc sinh" + (i+1) + ":");
            array[i] = scanner.nextInt();
        }

        int count =0;
        for (int j : array) {
            if (j >= 5 && j <= 10) {
                count++;
            }
        }

        System.out.println("so luong sinh vien qua mon la:" + count);


}}
