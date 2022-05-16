import java.util.Scanner;

public class ptBacNhat {
    public static void main(String[] args) {
        Scanner giaiPt = new Scanner(System.in);
        System.out.println("giải pt bậc nhất");
        System.out.println("nhập vào số a");
        int a = giaiPt.nextInt();
        System.out.println("nhập vào số b");
        int b = giaiPt.nextInt();
        System.out.println("nhập vào số c");
        int c = giaiPt.nextInt();
        int value;
        if(a !=0){
            value = (c-b)/a;
            System.out.println("phương trình có nghiệm x ="+ value);
        }else if(a==0){
            if (b==c){
                System.out.println("phương trình có vô số nghiệm");
            }else if(b!=c){
                System.out.println("phương trình vô nghiệm");
            }
        }

    }
}