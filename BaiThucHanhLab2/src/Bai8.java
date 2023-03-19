import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n so nguyen: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        System.out.println("nhap cac phan tu cua day so n :");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            sum += number;
            count++;
        }
        double tbc = (double) sum / count;
        System.out.println("trung cong cua n so nguyen la :" + tbc);
    }
}
