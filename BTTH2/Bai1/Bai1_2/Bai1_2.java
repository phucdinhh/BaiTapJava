package Bai1.Bai1_2;
import java.util.Scanner;

public class Bai1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        int temp;

        System.out.print("Nhap tu so cua A:");
        temp = scanner.nextInt();
        f1.setTuSo(temp);
        
        System.out.print("Nhap mau so cua A:");
        temp = scanner.nextInt();
        f1.setMauSo(temp);

        System.out.print("Nhap tu so cua B:");
        temp = scanner.nextInt();
        f2.setTuSo(temp);
        
        System.out.print("Nhap mau so cua B:");
        temp = scanner.nextInt();
        f2.setMauSo(temp); 

        scanner.close();

        Fraction tong = f1.congPhanSo(f2);
        Fraction hieu = f1.truPhanSo(f2);
        Fraction tich = f1.nhanPhanSo(f2);
        Fraction thuong = f1.chiaPhanSo(f2);
        
        System.out.println("Tong la: " + tong.getTuSo()+"/"+tong.getMauSo());
        System.out.println("Hieu la: " +hieu.getTuSo()+"/"+hieu.getMauSo());
        System.out.println("Tich la: " +tich.getTuSo()+"/"+tich.getMauSo());
        System.out.println("Thuong la: " +thuong.getTuSo()+"/"+thuong.getMauSo());
    }
}
