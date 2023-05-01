import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] asrgs) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // them cac phan tu vao hashSetString
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        // hien thi cac phan tu trong hashSetString
        System.out.println("Cac phan tu trong hashSetString");
        System.out.println(hashSetString);
        System.out.println("CNhap phan tu can xoa:");
        name = scanner.nextLine();

        // neu phan tu can xoa co ton tai hashSetString thi se thong bao xoa thanh cong
        // va hien thi cac phan tu con lai con lai thi thong bao xoa k thanh cong
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai trong hashSetString");
            System.out.println(hashSetString);
        } else {
            System.out.println("xoa khong thanh cong!");
        }
    }
}