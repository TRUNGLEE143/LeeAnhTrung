import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
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
        // cac phan tu hien tai
        System.out.println("Danh sach cac phan tu :");
        for (int i = 0; i < lengthA; i++) {
            System.out.printf("A[%d] = %d\t", i, arrA[i]);
        }
        // tinh tong cac so chan cac phan tu
        int sum = 0;
        for (int i = 0; i < lengthA; i++) {
            if (arrA[i] % 2 == 0) {
                sum += arrA[i];
            }
        }
        // result
        System.out.println("");
        System.out.printf("Tong cac phan tu chan trong arrA = %d", sum);
    }
}