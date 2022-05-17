import java.util.Scanner;

public class tienGuiNganHang {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("nhập vào số tiền gửi");
        double tienGui = money.nextDouble();
        System.out.println("nhập vào số tháng gửi");
        int soThangGui = money.nextInt();
        System.out.println("nhập vào lãi suất");
        double laiSuat =money.nextDouble();
        double tongTien=0;
        for (int i =0;i<soThangGui;i++){
        tongTien += tienGui*(laiSuat/100)/12*soThangGui;
        }
        System.out.println(tongTien);

    }
}
