package BTH1905;

import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        LinkedList<Integer> danhSach = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên dương: ");
        int n = sc.nextInt();

        // Nhập danh sách n số nguyên dương
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên dương thứ " + (i + 1) + ": ");
            int so = sc.nextInt();
            danhSach.add(so);
        }

        int sum = 0;
        int count = 0;

        // Tính trung bình cộng của các số chẵn
        for (int so : danhSach) {
            if (so % 2 == 0) {
                sum += so;
                count++;
            }
        }

        double trungBinhCong = (count > 0) ? (double) sum / count : 0;

        System.out.println("Trung bình cộng của các số chẵn là: " + trungBinhCong);
    }
}
