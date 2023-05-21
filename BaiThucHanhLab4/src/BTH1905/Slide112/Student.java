package BTH1905.Slide112;

import java.util.List;
import java.util.Scanner;

public class Student {
    public String HoTen;
    public double Diem;

    public String getHoten() {
        return HoTen;
    }

    public double getdiem() {
        return Diem;
    }

    public static void AddSv(List<Student> stdList) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Student sv = new Student();
            System.out.print("Nhập họ tên :");
            sv.HoTen = sc.nextLine();
            if (sv.HoTen.isEmpty()) {
                break;
            }
            System.out.print("Nhập điểm :");
            sv.Diem = sc.nextDouble();
            sc.nextLine();
            stdList.add(sv);
        }
    }

    public static void Demsvthilai(List<Student> stdList) {
        int cnt = 0;
        System.out.println("Cac Sinh Vien thi lai la :");
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).Diem <= 5) {
                System.out.println("Sinh viên thứ :" + (i + 1));
                System.out.println("Họ tên :" + stdList.get(i).HoTen);
                System.out.println("Điểm :" + stdList.get(i).Diem);
                ++cnt;
            }
        }
        System.out.println("Số lượng sinh viên thi lại là :" + cnt);
    }

    public static void SvDiemcaonhat(List<Student> stdList) {
        double max = stdList.get(0).Diem;
        for (int i = 1; i < stdList.size(); i++) {
            if (stdList.get(i).Diem > max) {
                max = stdList.get(i).Diem;
            }
        }
        System.out.println("Các sinh viên có điểm cao nhất: ");
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).Diem == max) {
                System.out.println("Sinh viên thứ :" + (i + 1));
                System.out.println("Họ tên :" + stdList.get(i).HoTen);
                System.out.println("Điểm :" + stdList.get(i).Diem);
            }
        }
    }

    public static void Timkiemsv(List<Student> std) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ tên:");
        String tmp = sc.nextLine();
        boolean check = false;
        for (Student sinhVien : std) {
            if (sinhVien.HoTen.equals(tmp)) {
                System.out.println("Họ tên :" + sinhVien.HoTen);
                System.out.println("Điểm :" + sinhVien.Diem);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Không tìm thấy !");
        }
    }

}
