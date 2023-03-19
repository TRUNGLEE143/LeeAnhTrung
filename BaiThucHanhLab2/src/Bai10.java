import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "";
        do {
            System.out.println("nhap chuoi co it hon 80 ky tu");
            s = scan.nextLine();
        } while (s.length() > 80);
        System.out.println("nhap vao ky tu can tim");
        String a = scan.nextLine();
        char b = a.charAt(0);
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == b) {
                dem++;
            }
        }
        System.out.println("so lan xuat hien cua ky tu " + b + " trong chuoi la " + dem + " lan");
    }
}