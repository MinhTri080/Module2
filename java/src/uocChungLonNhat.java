import java.util.Scanner;

public class uocChungLonNhat {
        public static void main(String[]args) {
             Scanner sc = new Scanner(System.in);
            System.out.print("Nhập giá trị a : ");
            int a = Math.abs(sc.nextInt());
            System.out.print("Nhập giá trị b : ");
            int b = Math.abs(sc.nextInt());


            while (a != b) {
                if (a == 0 || b == 0) {
                    System.out.println("Không có ước chung");
                    return;
                }
                if (a > b) {
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
            System.out.println("Ước lớn nhất là " + a);
//            int a;
//            int b;
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a: ");
//            a = input.nextInt();
//            System.out.println("Enter b: ");
//            b = input.nextInt();
//            int common = 0;
//            if (a == 0 || b == 0) {
//                System.out.println("No greatest common factor");
//            }
//            for (int i = 1; i <= a; i++) {
//                if (a % i == 0 && b % i == 0) {
//                    common = i;
//                }
//            }
//            System.out.println("Greatest common factor: " + common);
        }
    }

