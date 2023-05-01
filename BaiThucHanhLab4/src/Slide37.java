import java.util.LinkedList;

public class Slide37 {
    public static void main(String[] args) {
        // Khai bao 1 LinkedList co ten la list
        // co kieu la string
        LinkedList<String> list = new LinkedList<String>();
        // Add obj to List
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("vi du nhung phuong thuc addAll");
        System.out.println("------------------------------");
        // them cac phan tu cua list vao list A
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
        System.out.println("\nVi du su dung phuong thuc retainAll()");
        System.out.println("-------------------------------");
        // Khoi tao list B
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        // Xoa nhung phan tu khong thuoc listB khoi listA
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nVi du su dung phuong thuc removeAll()");
        System.out.println("--------------------------------------");
        // Xoa nhung phan tu thuoc listB khoi nick
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        // Show list throung for-each
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}