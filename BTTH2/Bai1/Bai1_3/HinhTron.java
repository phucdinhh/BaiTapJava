package Bai1.Bai1_3;

public class HinhTron extends DaGiac{
    private double banKinh;

    public HinhTron() {};

    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    @Override
    public void setCanh(double banKinh){
        this.banKinh = banKinh;
    }

    @Override
    public void inThongTin(){
        System.out.println("Hinh tron co ban kinh bang " + banKinh);
    }

    @Override
    public void inChuVi(){
        System.out.println("Hinh tron co chu vi bang " + 2*banKinh*3.14);
    }

    @Override
    public void inDienTich(){
        System.out.println("Hinh tron co dien tich bang "+ Math.pow(banKinh, 2)*3.14);
    }
}
