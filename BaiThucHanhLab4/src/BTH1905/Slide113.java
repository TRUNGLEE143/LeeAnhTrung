package BTH1905;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Slide113 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Thêm tên các loại trái cây vào HashSet
        System.out.print("Nhập tên các loại trái cây (kết thúc bằng 'q' để dừng): ");
        String fruit;
        while (!(fruit = sc.nextLine()).equals("q")) {
            hashSet.add(fruit);
        }

        // Hiển thị số phần tử trong HashSet
        System.out.println("Số phần tử trong HashSet: " + hashSet.size());

        // Kiểm tra loại trái cây tồn tại trong HashSet
        System.out.print("Nhập tên một loại trái cây: ");
        String fruitToCheck = sc.nextLine();
        if (hashSet.contains(fruitToCheck)) {
            System.out.println("Tìm thấy loại trái cây trong HashSet.");
        } else {
            System.out.println("Không tìm thấy loại trái cây trong HashSet.");
        }

        // Xóa một loại trái cây bất kỳ trong HashSet
        System.out.print("Nhập tên loại trái cây để xóa: ");
        String fruitToRemove = sc.nextLine();
        hashSet.remove(fruitToRemove);

        // Hiển thị các phần tử còn lại trong HashSet
        System.out.println("Các phần tử còn lại trong HashSet:");
        for (String fruitName : hashSet) {
            System.out.println(fruitName);
        }

        // Tạo List mới và thêm các phần tử của List vào HashSet
        List<String> newList = new ArrayList<>(hashSet);
        hashSet.addAll(newList);

        // Hiển thị lại HashSet sử dụng Iterator
        System.out.println("HashSet sau khi thêm List:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Xóa các phần tử của List có trong HashSet
        hashSet.removeAll(newList);

        // Hiển thị lại HashSet
        System.out.println("HashSet sau khi xóa các phần tử của List:");
        for (String fruitName : hashSet) {
            System.out.println(fruitName);
        }
    }
}
