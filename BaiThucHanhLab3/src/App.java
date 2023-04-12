public class App {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        HinhTruTron htt = new HinhTruTron();
        NhanVien nv = new NhanVien();
        // bai 1
        ht.nhapBanKinh();
        ht.hienthitthinhtron();
        // bai 2
        htt.nhaptthtt();
        htt.hienthitthinhtrutron();
        // bai 3
        nv.nhapttnv();
        nv.hienthittnv();
    }
}