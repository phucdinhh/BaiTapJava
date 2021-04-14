package Bai1.Bai1_2;

public class Fraction {
    private int tuSo;
    private int mauSo;

    Fraction(){

    }

    Fraction (int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void rutGon() {
        int ucln = timUCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
        if (mauSo <0) {
            tuSo = -tuSo; 
            mauSo = -mauSo;
        }
    }

    private int timUCLN(int a, int b) {
        if(a<0) {
            a=-a;
        }
        if(b<0) {
            b=-b;
        }
        while(a * b != 0) {
            if(a > b)
                a %= b;
            else 
                b %= a;
        }
        return a + b;
    }

    public Fraction congPhanSo (Fraction p) {
        Fraction result = new Fraction();
        result.setTuSo(this.getTuSo()*p.getMauSo() + this.getMauSo()*p.getTuSo());
        result.setMauSo(this.getMauSo()*p.getMauSo());
        result.rutGon();
        return result;
    }

    public Fraction truPhanSo (Fraction p) {
        Fraction result = new Fraction();
        result.setTuSo(this.getTuSo()*p.getMauSo() - this.getMauSo()*p.getTuSo());
        result.setMauSo(this.getMauSo()*p.getMauSo());
        result.rutGon();
        return result;
    }
    
    public Fraction nhanPhanSo (Fraction p) {
        Fraction result = new Fraction();
        result.setTuSo(this.getTuSo()*p.getTuSo());
        result.setMauSo(this.getMauSo()*p.getMauSo());
        result.rutGon();
        return result;
    }

    public Fraction chiaPhanSo (Fraction p) {
        Fraction result = new Fraction();
        result.setTuSo(this.getTuSo()*p.getMauSo());
        result.setMauSo(this.getMauSo()*p.getTuSo());
        result.rutGon();
        return result;
    }
}
