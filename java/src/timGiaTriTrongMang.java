import java.util.Scanner;

public class timGiaTriTrongMang {
    public static void main(String[] args) {
        String arr[]= {
                "sinh",
                "luong",
                "tien",
                "phong",
                "tri",
                "minh"
        };

        Scanner inputName = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm :");
        String input = inputName.nextLine();
        boolean exit = false;
        for (int i =0;i<arr.length;i++){
            if(arr[i].equals(input)){
                System.out.println("tên muốn tìm là :"+ input);
                exit = true;
                break;

            }

        }if (!exit){
            System.out.println("tên muốn tìm ko có trong danh sách");
        }

    }
}
