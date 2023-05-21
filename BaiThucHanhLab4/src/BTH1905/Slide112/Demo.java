package BTH1905.Slide112;

import java.util.LinkedList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Student> linkList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Student.AddSv(linkList);
        Student.Demsvthilai(linkList);
        Student.SvDiemcaonhat(linkList);
        Student.Timkiemsv(linkList);
    }
}
