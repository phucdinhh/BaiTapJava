package Bai1.Bai1_3;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {};

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void setCanh(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void inThongTin(){
        System.out.println("Hinh chu nhat co chieu dai bang "+ this.chieuDai + " co chieu rong bang " + this.chieuRong);
    }
    
    public void inChuVi(){
        System.out.println("Chu vi hinh chu nhat bang "+ (this.chieuDai+ this.chieuRong)*2);
    } 

    public void inDienTich(){
        System.out.println("Dien tich hinh chu nhat bang "+ this.chieuDai*this.chieuRong);
    }
}
