import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner money =new Scanner(System.in);
       int uSd,vnd;
        System.out.println("nhập vào giá trị của usd");
        uSd = money.nextInt();
        vnd = uSd * 23000;
        System.out.println(vnd);



    }
}
