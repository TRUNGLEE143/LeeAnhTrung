package shapes;

import java.util.Scanner;

public class HinhTru extends Hinhtron {
     public float chieucao;
     public HinhTru(){
          ten = "Hinh tru";
     }

     public void nhapchieucao(){
          nhapBanKinh();
          Scanner sc = new Scanner(System.in);
          System.out.println("chieu cao = ");
          chieucao = sc.nextFloat();
     }
     public void tinhthetich(){
          tinhdientich();
          thetich = dientich * chieucao;
     }
}
