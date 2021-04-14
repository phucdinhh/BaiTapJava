package Bai1;
import java.util.Scanner;

public class Bai1{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Bai 1.1 tinh khoang cach AB

        // Point p1 = new Point();
        // Point p2 = new Point();  

        // double temp11;
        
        // System.out.print("Nhap diem x1:");
        // temp = scanner.nextDouble();
        // p1.setX(temp);
        
        // System.out.print("Nhap diem y1:");
        // temp = scanner.nextDouble();
        // p1.setY(temp);

        // System.out.print("Nhap diem x2:");
        // temp = scanner.nextDouble();
        // p2.setX(temp);
        
        // System.out.print("Nhap diem y2:");
        // temp = scanner.nextDouble();
        // p2.setY(temp); 

        // double length1 = Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY() - p2.getY()),2));
        // System.out.print(length1);

        // Bai 1.2 Tinh tong, hieu, tich, thuong 2 phan so

        // Fraction f1 = new Fraction();
        // Fraction f2 = new Fraction();
        // int temp12;

        // System.out.print("Nhap tu so cua A:");
        // temp12 = scanner.nextInt();
        // f1.setTuSo(temp12);
        
        // System.out.print("Nhap mau so cua A:");
        // temp12 = scanner.nextInt();
        // f1.setMauSo(temp12);

        // System.out.print("Nhap tu so cua B:");
        // temp12 = scanner.nextInt();
        // f2.setTuSo(temp12);
        
        // System.out.print("Nhap mau so cua B:");
        // temp12 = scanner.nextInt();
        // f2.setMauSo(temp12); 

        // Fraction tong = f1.congPhanSo(f2);
        // Fraction hieu = f1.truPhanSo(f2);
        // Fraction tich = f1.nhanPhanSo(f2);
        // Fraction thuong = f1.chiaPhanSo(f2);
        
        // System.out.println("Tong la: " + tong.getTuSo()+"/"+tong.getMauSo());
        // System.out.println("Hieu la: " +hieu.getTuSo()+"/"+hieu.getMauSo());
        // System.out.println("Tich la: " +tich.getTuSo()+"/"+tich.getMauSo());
        // System.out.println("Thuong la: " +thuong.getTuSo()+"/"+thuong.getMauSo());

        // Bai 1.3 in thong tin, chu vi, dien tich cua da giac
        DaGiac hinhVuong = new HinhVuong();

        double temp13;

        System.out.print("Nhap do dai canh cua hinh vuong:");
        temp13 = scanner.nextInt();
        hinhVuong.setCanh(temp13);

        hinhVuong.inThongTin();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}
