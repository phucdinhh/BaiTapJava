package Bai1.Bai1_3;

public class HinhTamGiac {
    private double canh1;
    private double canh2;
    private double canh3;

    public HinhTamGiac() {};

    public HinhTamGiac(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }

    public double getCanh1() {
        return canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void inThongTin(){
        System.out.println("Hinh tam giac co 3 canh lan luot la: " + canh1 + ", " + canh2 + ", " + canh3);
    }

    public void inChuVi(){
        System.out.println("Hinh tam giac co chu vi bang " + (canh1 + canh2 + canh3));
    }

    public void inDienTich(){
        double nuaChuVi = (canh1 + canh2 + canh3)/2;
        System.out.println("Hinh tam giac co dien tich bang " + Math.sqrt(nuaChuVi*(nuaChuVi-canh1)*(nuaChuVi-canh2)*(nuaChuVi-canh3)));
    }
}
