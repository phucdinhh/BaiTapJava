package Bai2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        SinhVien sv[] = new SinhVien[n];

        for(int i = 0; i < n; i++){
            sv[i] = new SinhVien();
            System.out.println("Nhap thong tin cua sinh vien thu "+ (i+1) + ": ");
            System.out.print("Nhap ten: ");
            sv[i].setTen(sc.nextLine());
            System.out.print("Nhap MSSV: ");
            sv[i].setMSSV(sc.nextInt());
            System.out.print("Nhap diem giai tich: ");
            sv[i].setDiemGT(sc.nextDouble());
            System.out.print("Nhap diem vat ly: ");
            sv[i].setDiemVL(sc.nextDouble());
            System.out.print("Nhap diem nhap mon lap trinh: ");
            sv[i].setDiemNMLT(sc.nextDouble());sv[i].setDiemTB(sv[i].getDiemGT(), sv[i].getDiemVL(), sv[i].getDiemNMLT());
            sc.nextLine();
            
        }

        for(int i = 0; i< n; i++){
            System.out.println(sv[i].getTen());

            System.out.println(sv[i].getDiemTB());
        }
    }
}
