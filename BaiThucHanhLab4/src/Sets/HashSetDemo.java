package Sets;

import java.util.HashSet;
import java.util.Scanner;

import Models.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("MSV: ");
            int MSV = sc.nextInt();
            sc.nextLine();
            System.out.print("Họ tên: ");
            String HoTen = sc.nextLine();
            System.out.print("Tuổi: ");
            int Tuoi = sc.nextInt();
            students.add(new Student(MSV, HoTen, Tuoi));
        }

        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa thông tin sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");
            System.out.print("chọn một trong các chức năng trên: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên:");
                    System.out.print("MSV: ");
                    int MSV = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String HoTen = sc.nextLine();
                    System.out.print("Age: ");
                    int Tuoi = sc.nextInt();
                    students.add(new Student(MSV, HoTen, Tuoi));
                    System.out.println("Sinh viên được thêm thành công.");
                    break;
                case 2:
                    System.out.print("Nhập MSV cần sửa: ");
                    MSV = sc.nextInt();
                    sc.nextLine();
                    Student student = findStudent(students, MSV);
                    if (student == null) {
                        System.out.println("Sinh viên không tồn tại.");
                    } else {
                        System.out.println("Thêm thông tin mới cho sinh viên:");
                        System.out.print("Họ tên: ");
                        HoTen = sc.nextLine();
                        System.out.print("Tuoi: ");
                        Tuoi = sc.nextInt();
                        students.remove(student);
                        students.add(new Student(MSV, HoTen, Tuoi));
                        System.out.println("Sửa thông tin sinh viên thành công.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập MSV cần xóa: ");
                    MSV = sc.nextInt();
                    sc.nextLine();
                    student = findStudent(students, MSV);
                    if (student == null) {
                        System.out.println("Sinh viên không tồn tại.");
                    } else {
                        students.remove(student);
                        System.out.println("Xóa sinh viên thành công.");
                    }
                    break;
                case 4:
                    if (students.size() == 0) {
                        System.out.println("Không có sinh viên.");
                    } else {
                        System.out.println("Dánh sách sinh viên:");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }
        }

        sc.close();
    }

    private static Student findStudent(HashSet<Student> students, int mSV) {
        return null;
    }
}
