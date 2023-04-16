package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
     public HinhVuong(){
          ten = "Hinh Vuong";
     }

     public void nhapcanh(){
          System.out.println("canh = ");
          Scanner sc = new Scanner(System.in);
          dai = rong = sc.nextFloat();
     }
}
