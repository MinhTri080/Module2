import java.util.Scanner;

public class dienTichHCN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài :");
        float dai = input.nextInt();
        System.out.print("Nhập vào chiều rộng :");
        float rong = input.nextInt();
        float dienTich = dai * rong;
        System.out.println("Diện tích HCN là :"+ dienTich);
    }
}
