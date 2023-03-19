import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int hang = sc.nextInt();
        System.out.print("nhap so cot: ");
        int cot = sc.nextInt();
        int arrA[][] = new int[hang][cot];
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                arrA[i][j] = sc.nextInt();
            }
        }
        int max = arrA[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (arrA[i][j] > max) {
                    max = arrA[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong ma tran la:" + max);
    }
}