import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        Scanner numBer = new Scanner(System.in);
        System.out.println("nhập vào 1 số để kiểm tra");
        int num = numBer.nextInt();
        boolean test = true;
        if (num <2){
            System.out.println("đây ko phải là SNT");
        }
        else {
            int i = 2;
            while (i<num){
                if(num % i ==0){
                    test = false;
                    break;
                }
                i++;
            }


        }
        if (test == true){
            System.out.println("đây là snt");
        }
        else {
            System.out.println("đây ko là snt");
        }
    }
}


