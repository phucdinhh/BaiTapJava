package Bai2;

public class SinhVien {
    private int MSSV;
    private String ten;
    private double diemGT;
    private double diemVL;
    private double diemNMLT;
    private double diemTB;

    public SinhVien() {};

    public SinhVien(int MSSV, String ten, double diemGT, double diemVL, double diemNMLT, double diemTB){
        this.MSSV = MSSV;
        this.ten = ten;
        this.diemGT = diemGT;
        this.diemVL = diemVL;
        this.diemNMLT = diemNMLT;
        this.diemTB = diemTB;
    }

    public void setMSSV(int MSSV){
        this.MSSV = MSSV;
    }

    public void setTen(String ten){
        this.ten = ten;
    }

    public void setDiemGT(double diemGT){
        this.diemGT = diemGT;
    }

    public void setDiemVL(double diemVL){
        this.diemVL = diemVL;
    }

    public void setDiemNMLT(double diemNMLT){
        this.diemNMLT = diemNMLT;
    }

    public void setDiemTB(double diemGT, double diemVL, double diemNMLT){
        this.diemTB =  (diemGT+diemVL+diemNMLT)/3;
    }

    public int getMSSV(){
        return MSSV;
    }

    public String getTen(){
        return ten;
    }

    public double getDiemGT(){
        return diemGT;
    }

    public double getDiemVL(){
        return diemVL;
    }

    public double getDiemNMLT(){
        return diemNMLT;
    }

    public double getDiemTB(){
        return diemTB;
    }
}
