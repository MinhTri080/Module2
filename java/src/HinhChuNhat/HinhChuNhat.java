package HinhChuNhat;

public class HinhChuNhat {
    private int dai;
    private int rong;
    public HinhChuNhat(){

    }
    public HinhChuNhat(int dai,int rong){
        this.dai =dai;
        this.rong = rong;
    }
    public int getDai(){
        return dai;
    }
    public void setDai(int dai){
        this.dai=dai;
    }
    public int getRong(){
        return rong;
    }
    public void setRong(int rong){
        this.rong = rong;
    }
    public int tinhDienTich(){
        return this.dai *this.rong;
    }
    public int chuVi(){
        return (this.dai+this.rong)*2;
    }
}
