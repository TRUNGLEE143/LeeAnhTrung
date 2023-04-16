package main;

import shapes.HinhChuNhat;
import shapes.HinhTru;
import shapes.HinhVuong;
import shapes.Hinhtron;

public class MainClass {
     public static void main(String[] args) {

          // Thử nghiệm với lớp Hình tròn
          Hinhtron htron = new Hinhtron();
          htron.xuatten();
          htron.nhapBanKinh();
          htron.tinhchuvi();
          htron.tinhdientich();
          htron.inchuvi();
          htron.indientich();

          // Thử nghiệm với lớp Hình trụ
          HinhTru htru = new HinhTru();
          htru.xuatten();
          htru.nhapchieucao();
          htru.tinhthetich();
          htru.inthetich();

          // Thử nghiệm với lớp Hình Chữ Nhật
          HinhChuNhat hcn = new HinhChuNhat();
          hcn.xuatten();
          hcn.nhapchieudai();
          hcn.nhapchieurong();
          hcn.tinhchuvi();
          hcn.tinhdientich();
          hcn.inchuvi();
          hcn.indientich();

          // Thử Nghiệm với lớp Hình vuông
          HinhVuong hv = new HinhVuong();
          hv.xuatten();
          hv.nhapcanh();
          hv.tinhchuvi();
          hv.tinhdientich();
          hv.inchuvi();
          hv.indientich();
     }
}
