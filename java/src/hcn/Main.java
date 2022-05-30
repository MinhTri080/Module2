package hcn;

import java.util.Scanner;

public class Main extends hinhCN{
    public Main (double height,double width){
        super(height,width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        double height = scanner.nextDouble();
        System.out.println("Nhập chiều rộng");
        double width = scanner.nextDouble();
        hinhCN hinhcn = new hinhCN(height,width);
        System.out.println("Diện tích hình chữ nhật là :"+ hinhcn.dienTichHCN());
        System.out.println("Chu vi hình chữ nhật là :"+hinhcn.chuViHCN());
        hinhcn.hienThi();
    }
}
