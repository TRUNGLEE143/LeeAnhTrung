package BTH1905.Slide114;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sinhvien {
    public String msv;
    public String hvt;
    public String lop;

    public static void NhapDS(Map<String, List<Sinhvien>> svm) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n sinh vien :");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            Sinhvien sv = new Sinhvien();
            System.out.println("Nhap ma sinh vien :");
            sv.msv = sc.nextLine();
            System.out.println("Nhap ho ten :");
            sv.hvt = sc.nextLine();
            System.out.println("Nhap lop :");
            sv.lop = sc.nextLine();
            List<Sinhvien> newSv = svm.getOrDefault(sv.lop, new ArrayList<>());
            newSv.add(sv);
            svm.put(sv.lop, newSv);
        }
    }

    public static void DsSvThuocLop(Map<String, List<Sinhvien>> svm) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten lop: ");
        String tmpLop = sc.nextLine();

        System.out.println("Danh sach sinh vien thuoc lop " + tmpLop + ":");
        List<Sinhvien> listSv = svm.get(tmpLop);
        if (listSv != null) {
            for (Sinhvien sv : listSv) {
                System.out.println("Msv: " + sv.msv);
                System.out.println("hvt: " + sv.hvt);
                System.out.println("lop: " + sv.lop);
                System.out.println();
            }
        } else {
            System.out.println("Khong tim thay !");
        }
    }

    public static void DsSvThuocMsv(Map<String, List<Sinhvien>> svm) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma sinh vien: ");
        String tmpMsv = sc.nextLine();

        boolean found = false;
        for (List<Sinhvien> lop : svm.values()) {
            for (Sinhvien sv : lop) {
                if (sv.msv.equalsIgnoreCase(tmpMsv)) {
                    System.out.println("hvt: " + sv.hvt);
                    System.out.println("Lop: " + sv.lop);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien !");
        }
    }

}