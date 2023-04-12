import java.util.Scanner;

public class NhanVien {
    String name;
    int age;
    float hesoluong;
    final float luongcoban = 1.490f;

    public void nhapttnv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten nv :");
        name = sc.nextLine();
        System.out.println("nhap tuoi nv");
        age = sc.nextInt();
        System.out.println("nhap he so luong nv :");
        hesoluong = sc.nextFloat();
    }

    public float tinhluongnv() {
        return (hesoluong * luongcoban);
    }

    public void hienthittnv() {
        System.out.printf("%s - %d tuoi va co luong : %fk", name, age, tinhluongnv());
    }
}
