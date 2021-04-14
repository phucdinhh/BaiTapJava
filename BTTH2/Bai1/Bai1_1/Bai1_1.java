package Bai1.Bai1_1;
import java.util.Scanner;

public class Bai1_1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Bai 1.1 tinh khoang cach AB

        Point p1 = new Point();
        Point p2 = new Point();  

        double temp;
        
        System.out.print("Nhap hoanh do cua diem A: ");
        temp = scanner.nextDouble();
        p1.setX(temp);
        
        System.out.print("Nhap tung do cua diem A: ");
        temp = scanner.nextDouble();
        p1.setY(temp);

        System.out.print("Nhap hoanh do cua diem B: ");
        temp = scanner.nextDouble();
        p2.setX(temp);
        
        System.out.print("Nhap tung do cua diem B: ");
        temp = scanner.nextDouble();
        p2.setY(temp); 

        scanner.close();

        double length1 = Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY() - p2.getY()),2));
        System.out.print("chieu dai cua doan AB bang " + length1);
    }
}

        //
        // Bai 1.3 in thong tin, chu vi, dien tich cua da giac
    //     DaGiac hinhVuong = new HinhVuong();
    //     HinhChuNhat hinhChuNhat = new HinhChuNhat();
    //     DaGiac hinhTron = new HinhTron();
    //     HinhTamGiac hinhTamGiac = new HinhTamGiac();

    //     double temp13;

    //     System.out.print("Nhap do dai canh cua hinh vuong: ");
    //     temp13 = scanner.nextDouble();
    //     hinhVuong.setCanh(temp13);

    //     System.out.print("Nhap chieu dai cua hinh chu nhat: ");
    //     temp13 = scanner.nextDouble();
    //     hinhChuNhat.setChieuDai(temp13);

    //     System.out.print("Nhap chieu rong cua hinh chu nhat: ");
    //     temp13 = scanner.nextDouble();
    //     hinhChuNhat.setChieuRong(temp13);

    //     System.out.print("Nhap ban kinh hinh tron: ");
    //     temp13 = scanner.nextDouble();
    //     hinhTron.setCanh(temp13);

    //     System.out.print("Nhap canh 1 cua tam giac: ");
    //     temp13 = scanner.nextDouble();
    //     hinhTamGiac.setCanh1(temp13);

    //     System.out.print("Nhap canh 2 cua tam giac: ");
    //     temp13 = scanner.nextDouble();
    //     hinhTamGiac.setCanh2(temp13);

    //     System.out.print("Nhap canh 3 cua tam giac: ");
    //     temp13 = scanner.nextDouble();
    //     hinhTamGiac.setCanh3(temp13);


    //     hinhVuong.inThongTin();
    //     hinhVuong.inChuVi();
    //     hinhVuong.inDienTich();

    //     hinhChuNhat.inThongTin();
    //     hinhChuNhat.inChuVi();
    //     hinhChuNhat.inDienTich();

    //     hinhTron.inThongTin();
    //     hinhTron.inChuVi();
    //     hinhTron.inDienTich();

    //     hinhTamGiac.inThongTin();
    //     hinhTamGiac.inChuVi();
    //     hinhTamGiac.inDienTich();
    // }
// }
