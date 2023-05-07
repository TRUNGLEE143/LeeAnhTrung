package Models;

import java.util.Scanner;

public class Student {
    public String HoTen;
    public int Tuoi;

    public Student(int mSV, String hoTen2, int tuoi2) {
    }

    public Student() {
    }

    public String getHoten() {
        return HoTen;
    }

    public void setHoten(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.HoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.Tuoi = sc.nextInt();
    }

    public void showInfo() {
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Tuoi: " + this.Tuoi);
    }
}
