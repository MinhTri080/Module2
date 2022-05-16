import java.util.Scanner;

public class tinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner dayInMonth = new Scanner(System.in);
        System.out.println("Muốn tìm số ngày trong tháng mời nhập số 1-12 ");
        int day = dayInMonth.nextInt();
        switch (day){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("tháng có 31 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("tháng có 30 ngày");
                break;
            case 2 :
                System.out.println("tháng có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("tháng bạn nhập ko đúng,mời nhập lại");
                break;

        }
    }
}
