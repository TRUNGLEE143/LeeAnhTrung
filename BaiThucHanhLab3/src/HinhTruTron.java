import java.util.Scanner;

public class HinhTruTron {
    public float bk;
    public float h;
    final float PI = 3.14f;

    public void nhaptthtt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ban kinh tru tron :");
        bk = sc.nextFloat();
        System.out.println("nhap chieu cao hinh tru tron : ");
        h = sc.nextFloat();
    }

    public double set_thetich() {
        return (PI * Math.pow(bk, 2) * h);
    }

    public void hienthitthinhtrutron() {
        System.out.println("ban kinh hinh tru tron la : " + bk);
        System.out.println("chieu cao cua hinh tru tron la :" + h);
        System.out.println("the tich cua hinh tron la :" + set_thetich());
    }

}