package Tong1Cot;

import java.util.Scanner;

public class Tong1Cot {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhâp số cột b muốn tính tổng");
        int N =scanner.nextInt();

            for (int i = 0;i< array.length;i++){
                sum += array[i][N];
            } System.out.println("tổng cột " + N + ":" + sum);
    }
}
