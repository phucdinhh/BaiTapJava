package Bai2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        SinhVien sv[] = new SinhVien[n];

        // Nhập dữ liệu
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

        // Liệt kê danh sách sinh viên nhận được học bổng xuất sắc
        System.out.print("Nhung sinh vien co hoc luc xuat sac la: ");
        for(int i = 0; i< n; i++){
            if(sv[i].getDiemTB() >= 8 && sv[i].getDiemNMLT() >= 9){
                System.out.print(sv[i].getTen()+" ");
            }
        }

        // Xuất thông tin những sinh viên có điểm trung bình cao nhất
        double max = 0;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j < n; j++){ 
                if(sv[j].getDiemTB() >= max){
                    max = sv[j].getDiemTB();
                }
            }
        }
        System.out.print("\nSinh vien co diem trung binh cao nhat la: ");
        for(int i = 0; i< n; i++){
            if(sv[i].getDiemTB()==max) System.out.print(sv[i].getTen()+" ");
        }

        // Sắp xếp danh sách sinh viên giảm dần theo điểm trung bình
        for(int i = 0; i< n; i++){
            for(int j = i+1; j < n; j++){
                if(sv[i].getDiemTB() < sv[j].getDiemTB()){
                    SinhVien temp = new SinhVien();
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
        System.out.print("\nsinh vien co diem trung binh giam dan la: ");
        for(int i = 0; i< n; i++){
            System.out.print(sv[i].getTen()+" ");
        }

        // Xuất danh sách top 10 sinh viên có điểm cao nhất.
        System.out.print("\nTop 10 sinh vien co diem trung binh cao nhat la: ");
        if(n<10){
            for(int i = 0; i < n; i++){
                System.out.print(sv[i].getTen()+" ");
            }
        } else {
            for(int i = 0; i < 10; i++){
                System.out.print(sv[i].getTen()+" ");
            }
        }
        sc.close();
    }
}
