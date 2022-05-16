import java.util.Scanner;

public class namNhuanNamKoNhuan {
    public static void main(String[] args) {
        Scanner tinhNam = new Scanner(System.in);
        System.out.println("nhặp vào số năm muốn tìm");
        int nam = tinhNam.nextInt();
        if (nam %4 ==0){
            if (nam %100 ==0){
                if (nam % 400 ==0){
                    System.out.println(nam+"là năm nhuận");
                }else
                    System.out.println(nam + "là năm ko nhuận");
            }else
                System.out.println(nam + "là năm nhuận");
        }else System.out.println( nam + "là năm ko nhuận");

    }
}
//năm nhuận thì if(nam%400==0 || (nam%4==0&&nam%100!=0)