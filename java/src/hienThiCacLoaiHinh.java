import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choise = -1;
        while (choise != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Hình Chữ Nhật");
            System.out.println("2. Tam Giác Vuông");
            System.out.println("3. Tam Giác Cân");
            System.out.println("0. Exit");
            System.out.println("Mời lựa chọn");
            choise = input.nextInt();
            int dai = 6;
            int rong = 4;
            switch (choise) {
                case 1:
                    for (int i = 1; i <= rong; i++) {
                        System.out.println();
                        for (int j = 1; j <= dai; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println();
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        System.out.println();
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }
}
