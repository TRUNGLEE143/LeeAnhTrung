import java.util.LinkedHashSet;

public class Slide59 {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Thêm các phần tử vào set
        set.add("Java");
        set.add("Python");
        set.add("C++");

        // Hiển thị các phần tử ban đầu trong set
        System.out.println("Các phần tử ban đầu trong set: " + set);

        // Xóa phần tử "Python" khỏi set
        set.remove("Python");

        // Hiển thị các phần tử còn lại trong set
        System.out.println("Các phần tử còn lại trong set sau khi xóa \"Python\": " + set);
    }
}