import java.util.TreeMap;

public class Slide107 {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap = new TreeMap<>();
        myMap.put("A", 1);
        myMap.put("B", 2);
        myMap.put("C", 3);

        // Hiển thị TreeMap ban đầu
        System.out.println("TreeMap ban đầu:");
        for (String key : myMap.keySet()) {
            System.out.println(key + " => " + myMap.get(key));
        }

        // Thay đổi giá trị của entry có khóa là "B"
        myMap.put("B", 4);

        // Hiển thị TreeMap sau khi thay đổi
        System.out.println("\nTreeMap sau khi thay đổi:");
        for (String key : myMap.keySet()) {
            System.out.println(key + " => " + myMap.get(key));
        }
    }
}