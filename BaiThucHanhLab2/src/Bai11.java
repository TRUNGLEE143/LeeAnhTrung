import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phan tu :");
            n = sc.nextInt();
        } while (n <= 0);
        int arrA[] = new int[n];
        int lengthA = arrA.length;
        System.out.println("Nhap phan tu vao mang:");
        for (int i = 0; i < lengthA; i++) {
            System.out.printf("A[%d] = ", i);
            arrA[i] = sc.nextInt();
        }
        System.out.println("Danh sach cac phan tu :");
        for (int i = 0; i < lengthA; i++) {
            System.out.printf("A[%d] = %d\t", i, arrA[i]);
        }
        for (int i = 0; i < lengthA - 1; i++) {
            for (int j = i + 1; j < lengthA; j++) {
                if (arrA[i] > arrA[j]) {
                    int tg = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = tg;
                }
            }
        }
        System.out.println("\nCac phan tu da duoc sap xep :");
        for (int i = 0; i < lengthA; i++) {
            System.out.printf("A[%d] = %d\t", i, arrA[i]);
        }

    }
}