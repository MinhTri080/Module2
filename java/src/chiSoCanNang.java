import java.util.Scanner;

public class chiSoCanNang {
    public static void main(String[] args) {
        Scanner kg = new Scanner(System.in);
        System.out.println("input height");
        double height = kg.nextDouble();
        System.out.println("input weight");
        double weight = kg.nextDouble();
        double bmi = weight / (height * height);
        if (bmi >= 18.5 && bmi <25){
            System.out.println("normal");
        }else
            if(bmi >=25.0 && bmi <30.0){
            System.out.println("overweight");
            }else
                if(bmi>=30){
                    System.out.println("obese");
                }else
                    if(bmi<18.5){
                        System.out.println("underweight");
                    }
    }
}
