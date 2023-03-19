import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ki tu :");
        String str = sc.nextLine();
        int lowerCase = 0;
        int upperCase = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCase++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCase++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                number++;
            }
        }
        System.out.printf("So luong ki tu thuong: %d. So luong ki tu hoa: %d. So luong so: %d", lowerCase, upperCase,
                number);
    }
}
