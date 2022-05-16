import java.util.Scanner;

public class hienThiLoiChao {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");
        String reply = name.nextLine();
        System.out.println("Hello "+ reply);
    }
}
