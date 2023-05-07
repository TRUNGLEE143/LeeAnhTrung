package Lists;

import java.util.LinkedList;
import java.util.Scanner;
import Models.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Nhập số sinh viên: ");
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
                    System.out.print("Họ tên: ");
                    String HoTen = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int Tuoi = sc.nextInt();
                    students.add(new Student(MSV, HoTen, Tuoi));
                    System.out.println("Sinh viên được thêm thành công.");
                    break;
                case 2:
                    System.out.print("Nhập MSV cần sửa: ");
                    MSV = sc.nextInt();
                    sc.nextLine();
                    int index = findStudent(students, MSV);
                    if (index == -1) {
                        System.out.println("Sinh viên không tồn tại .");
                    } else {
                        System.out.println("Thêm thông tin mới cho sinh viên:");
                        System.out.print("Tuổi: ");
                        HoTen = sc.nextLine();
                        System.out.print("Age: ");
                        Tuoi = sc.nextInt();
                        students.set(index, new Student(MSV, HoTen, Tuoi));
                        System.out.println("Sửa thông tin sinh viên thành công.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập MSV cần xóa: ");
                    MSV = sc.nextInt();
                    sc.nextLine();
                    index = findStudent(students, MSV);
                    if (index == -1) {
                        System.out.println("Sinh viên không tồn tại .");
                    } else {
                        students.remove(index);
                        System.out.println("Xóa sinh viên thành công.");
                    }
                    break;
                case 4:
                    if (students.size() == 0) {
                        System.out.println("Không có sinh viên.");
                    } else {
                        System.out.println("Dánh sách sinh viên:");
                        for (Student student : students) {
                            System.out.println(student);
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

    private static int findStudent(LinkedList<Student> students, int mSV) {
        return 0;
    }
}
