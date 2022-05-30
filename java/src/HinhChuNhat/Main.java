package HinhChuNhat;

import java.util.Scanner;

public class Main extends HinhChuNhat{

    public Main(){

    }
    public Main(int dai, int rong) {
        super(dai, rong);
    }

    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        int dai = sc.nextInt();
        System.out.println("Nhập chiều rộng");
        int rong = sc.nextInt();


        hinhChuNhat.setDai(dai);
        hinhChuNhat.setRong(rong);
        System.out.println("diện tích HCN là :"+ hinhChuNhat.tinhDienTich());
        System.out.println("chu vi HCN là : "+ hinhChuNhat.chuVi());
    }

}
