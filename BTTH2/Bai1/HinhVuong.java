package Bai1;

/**
 * HinhVuong
 */
public class HinhVuong extends DaGiac{
    private double canhHinhVuong;

    public HinhVuong() {};

    @Override
    public void setCanh(double canhHinhVuong){
        this.canhHinhVuong = canhHinhVuong;
    }

    public double getCanh(){
        return canhHinhVuong;
    }

    @Override
    public void inThongTin(){
        System.out.println("Hinh vuong co canh bang "+ this.canhHinhVuong);
    }
    
    @Override
    public void inChuVi(){
        System.out.println("Chu vi hinh vuong bang "+ this.canhHinhVuong*4);
    } 

    public void inDienTich(){
        System.out.println("Dien tich hinh vuong bang "+ Math.pow(this.canhHinhVuong, 2));
    }
}