package Menu;

import java.util.Scanner;

public class Menu {
    int choiseNumber;
    Scanner scanner = new Scanner(System.in);
       public void menuTong(){

               System.out.println("Nhấn để chọn (nhập 1/2/3,4):");
               System.out.println("Mời chọn tính năng");
               System.out.println("*************************");
               System.out.println("*1.Quản lí người dùng    *");
               System.out.println("*2.Quản lí bánh          *");
               System.out.println("*3.Quản lí đơn đặt hàng  *");
               System.out.println("*4.Exit                  *");
               System.out.println("*************************");
           do {
               choiseNumber = scanner.nextInt();
               switch (choiseNumber) {
                   case 1: Menu1();
                       break;
                   case 2: Menu2();
                       break;
                   case 3: Menu3();
                       break;
                   case 4 :
                       System.exit(4);
                   default:
                       System.out.println("Mời nhập lại");
                       break;
               }
           } while (choiseNumber!=4);
       }
    public void Menu1(){
        System.out.println("Menu1");
        System.out.println("*************************");
        System.out.println("*1.Thêm nhân viên        *");
        System.out.println("*2.Quản lí nhân viên     *");
        System.out.println("*3.Danh sách nhân viên   *");
        System.out.println("*4.Quay lại               *");
        System.out.println("*************************");
        do {
            System.out.println("nhập số để chọn");
            choiseNumber = scanner.nextInt();
            switch (choiseNumber){
                case 4: menuTong();
                break;
            }

        }while (choiseNumber!=4);
    }
    public void Menu2(){
        System.out.println("Menu2");
        System.out.println("*************************");
        System.out.println("*1.Thêm bánh            *");
        System.out.println("*2.Quản lí bánh         *");
        System.out.println("*3.Danh sách bánh       *");
        System.out.println("*4.Quay lại             *");
        System.out.println("*************************");
        do {
            System.out.println("nhập số để chọn");
            choiseNumber = scanner.nextInt();
            switch (choiseNumber){
                case 4: menuTong();
                    break;
            }

        }while (choiseNumber!=4);
    }
    public void Menu3(){
        System.out.println("Menu3");
        System.out.println("*************************");
        System.out.println("*1.Thêm đơn hàng        *");
        System.out.println("*2.Quản lí đơn hàng     *");
        System.out.println("*3.Danh sách đơn hàng   *");
        System.out.println("*4.Quay lại             *");
        System.out.println("*************************");
        do {
            System.out.println("nhập số để chọn");
            choiseNumber = scanner.nextInt();
            switch (choiseNumber){
                case 4: menuTong();
                    break;
            }

        }while (choiseNumber!=4);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuTong();
    }
}

