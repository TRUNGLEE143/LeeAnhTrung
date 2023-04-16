package shapes;

import java.util.Scanner;

public class Hinhtron extends HinhHoc {
     public float bankinh;
     public Hinhtron(){
          ten = "HinhTron";
     }

     public void nhapBanKinh(){
          System.out.println("ban kinh = ");
          Scanner sc = new Scanner(System.in);
          bankinh = sc.nextFloat();
     }

     public void tinhchuvi(){
          chuvi = 2 * PI * bankinh;
     }

     public void tinhdientich(){
          dientich = PI * bankinh * bankinh;
     }
}
