package BTH1905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập vào dãy số
        System.out.print("Nhập vào số lượng phần tử trong dãy số: ");
        int n = scanner.nextInt();

        System.out.println("Nhập vào dãy số:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Tìm số nguyên lớn nhất
        int max = Collections.max(numbers);
        System.out.println("Số nguyên lớn nhất trong dãy là: " + max);

        // Nhập vào số nguyên và xoá các phần tử có giá trị bằng số vừa nhập
        System.out.print("Nhập vào số nguyên cần xoá: ");
        int deleteNumber = scanner.nextInt();

        numbers.removeIf(number -> number == deleteNumber);
        System.out.println("Dãy số sau khi xoá: " + numbers);

        // Sắp xếp dãy số và in ra màn hình
        Collections.sort(numbers);
        System.out.println("Dãy số sau khi sắp xếp: " + numbers);
    }
}
