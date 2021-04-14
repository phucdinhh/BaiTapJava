package Bai1.Bai1_3;
import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaGiac hinhVuong = new HinhVuong();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        DaGiac hinhTron = new HinhTron();
        HinhTamGiac hinhTamGiac = new HinhTamGiac();

        double temp;

        System.out.print("Nhap do dai canh cua hinh vuong: ");
        temp = scanner.nextDouble();
        hinhVuong.setCanh(temp);

        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        temp = scanner.nextDouble();
        hinhChuNhat.setChieuDai(temp);

        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        temp = scanner.nextDouble();
        hinhChuNhat.setChieuRong(temp);

        System.out.print("Nhap ban kinh hinh tron: ");
        temp = scanner.nextDouble();
        hinhTron.setCanh(temp);

        System.out.print("Nhap canh 1 cua tam giac: ");
        temp = scanner.nextDouble();
        hinhTamGiac.setCanh1(temp);

        System.out.print("Nhap canh 2 cua tam giac: ");
        temp = scanner.nextDouble();
        hinhTamGiac.setCanh2(temp);

        System.out.print("Nhap canh 3 cua tam giac: ");
        temp = scanner.nextDouble();
        hinhTamGiac.setCanh3(temp);

        scanner.close();

        hinhVuong.inThongTin();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();

        hinhChuNhat.inThongTin();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        hinhTron.inThongTin();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        hinhTamGiac.inThongTin();
        hinhTamGiac.inChuVi();
        hinhTamGiac.inDienTich();
    }
}
