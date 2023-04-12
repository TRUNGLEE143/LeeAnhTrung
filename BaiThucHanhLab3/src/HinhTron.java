import java.util.Scanner;

public class HinhTron {
    // cac thuoc tinh
    public float banKinh;
    public double chuVi;
    public double dienTich;
    final float PI = 3.14f;

    // cac phuong thuc
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ban kinh hinh tron :");
        banKinh = sc.nextFloat();
    }

    public double set_chuvi() {
        return chuVi = 2 * PI * banKinh;
    }

    public double set_dientich() {
        return dienTich = PI * Math.pow(banKinh, 2);
    }

    public void hienthitthinhtron() {
        System.out.println("ban kinh hinh tron la :" + banKinh);
        System.out.println("chu vi hinh tron la : " + set_chuvi());
        System.out.println("dien tich hinh tron la :" + set_dientich());
    }

}