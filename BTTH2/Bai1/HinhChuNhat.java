package Bai1;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {};

    
    public void setCanh(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
    }

    public double getCanh(){
        return chieuDai;
    }

    public void inThongTin(){
        System.out.println("Hinh vuong co canh bang "+ this.chieuDai);
    }
    
    public void inChuVi(){
        System.out.println("Chu vi hinh vuong bang "+ this.chieuDai*4);
    } 

    public void inDienTich(){
        System.out.println("Dien tich hinh vuong bang "+ Math.pow(this.chieuDai, 2));
    }
}
