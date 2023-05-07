package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Nhập số lượng sinh viên:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.inputInfo();
            students.add(student);
        }

        System.out.println("\nDanh sách sinh viên:");
        for (Student student : students) {
            student.showInfo();
        }

        System.out.println("\n Chọn một trong những chức năng sau :");
        System.out.println("1. Thêm mới thông tin sinh viên");
        System.out.println("2. Sửa thông tin sinh viên");
        System.out.println("3. Xóa thông tin sinh viên");
        System.out.println("4. Thoát");
        int choice = sc.nextInt();

        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên cần thêm:");
                    Student newStudent = new Student();
                    newStudent.inputInfo();
                    students.add(newStudent);
                    break;
                case 2:
                    System.out.println("Nhập tên sinh viên cần sửa thông tin:");
                    String nameToEdit = sc.next();
                    boolean edited = false;
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        if (s.getHoten().equalsIgnoreCase(nameToEdit)) {
                            System.out.println("Nhập tuổi mới cho sinh viên " + nameToEdit + ":");
                            int newTuoi = sc.nextInt();
                            sc.nextLine();
                            s.setTuoi(i);(newTuoi);
                            edited = true;
                            break;
                        }
                    }
                    if (edited) {
                        System.out.println("Sửa thông tin sinh viên " + nameToEdit + " Thành công");
                    } else {
                        System.out.println("Không tìm thấy sinh viên tên là " + nameToEdit);
                    }
                    break;
                case 3:
                    System.out.println("Nhập tên sinh viên cần xóa:");
                    String nameToDelete = sc.next();
                    boolean deleted = false;
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        if (s.getHoten().equalsIgnoreCase(nameToDelete)) {
                            students.remove(i);
                            deleted = true;
                            break;
                        }
                    }
                    if (deleted) {
                        System.out.println("Xóa sinh viên " + nameToDelete + " Thành công");
                    } else {
                        System.out.println("Không tìm thấy sinh viên tên là " + nameToDelete);
                    }
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
                    break;
            }

            System.out.println("\nDanh sách sinh viên:");
            for (Student student : students) {
                student.showInfo();
            }

            System.out.println("\n Chọn một trong những chức năng sau :");
            System.out.println("1. Thêm mới thông tin sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa thông tin sinh viên");
            System.out.println("4. Thoát");
            choice = sc.nextInt();
        }

        System.out.println("Kết thúc");
    }
}