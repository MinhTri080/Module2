package hcn;

import java.awt.*;

public class hinhCN {
    double height, width;

    public hinhCN(double height, double widht) {
        this.height = height;
        this.width = widht;
    }

    public double dienTichHCN() {
        return this.height * this.width;
    }

    public double chuViHCN() {
        return (this.width + this.height) * 2;
    }
    public void hienThi(){
        System.out.println("chiều dài ="+ width + "chiều rộng ="+ height);
    }
}
