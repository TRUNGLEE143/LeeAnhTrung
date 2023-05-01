import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua ArrayList ket thuc mang hay nhap het");
        while (sc.hasNextInt()) {
            number.add(sc.nextInt());
        }

        int min = number.get(0);
        int max = number.get(0);
        for (int i = 1; i < number.size(); i++) {
            if (number.get(i) < min) {
                min = number.get(i);
            }
            if (number.get(i) > max) {
                max = number.get(i);
            }
        }

        System.out.println("Phan tu nho nhat la " + min);
        System.out.println("Phan tu lon nhat la " + max);
    }
}