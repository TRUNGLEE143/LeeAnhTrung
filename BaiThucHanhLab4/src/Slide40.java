import java.util.Scanner;
import java.util.LinkedList;

public class Slide40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao 1 danh sach lien ket
        // Luu tru cac thang trong nam
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.println("Nhap vao chi so cua phan tu can lay:");
        int index = scanner.nextInt();
        // kiem tra neu chi so lon hon hoac bang 0
        // va nho hon kich thuoc cua linkedList - 1 thi moi lay
        // nguoc lai thong bao loi
        if ((index < 0) || (index > (linkedList.size() - 1))) {
            System.out.println("chi so can lay phai lon hon 0 va nho hon" + (linkedList.size() - 1));
        } else {
            // truy cap phan tu co chi so index trong linkedList
            // vi linkedList co kieu la String
            // nen cac phan tu con cua no cung co kieu du lieu la String
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so =" + index + "trong linkedList la" + node);
        }

        // truy cap phan tu dau tien trong danh sach
        // su dung phuong thuc getFist()
        String firstNode = linkedList.get(index);

        // truy cap phan tu dauu tien trong danh sach
        // su dung phuong thuc getLast()
        String lastNode = linkedList.getLast();

        System.out.println("\nPhan tu dau tien trong danh sach la" + firstNode
                + "; Phan tu cuoi cung trong danh sach la " + lastNode);
    }
}