import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Nhap so thu 1:");
        a = sc.nextDouble();
        System.out.println("Nhap so thu 2");
        b = sc.nextDouble();
        System.out.printf("Tong 2 so vua nhap la: %f", a + b);
        System.out.printf("Hieu 2 so vua nhap la: %f", a - b);
        System.out.printf("Tich 2 so vua nhap la: %f", a * b);
        System.out.printf("Thuong 2 so vua nhap la: %f", a / b);
        if (a > b) {
            System.out.println("So thu nhat lon hon so thu hai");
        } else if (a < b) {
            System.out.println("So thu nhat be hon so thu hai");
        } else {
            System.out.println("So thu nhat bang so thu hai");
        }
        System.out.printf("Chia lay du 2 so vua nhap la: %f", a > b ? a % b : b % a);
    }
}