package Linked_demo;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("co co");
        list.add("rambo");
        System.out.println("các phần tử trong list là :"+ list);
//        for (int i = 0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for (String str : list){
//            System.out.println(str);
//        }

//        Iterator<String> iterator = list.iterator();
//        System.out.println("các phần tử có trong list là ");
//        while (iterator.hasNext()){
//            System.out.println((String) iterator.next());
//        }
//
//        LinkedList<String> list1 = new LinkedList<>();
//        list1.add("mai do");
//        list1.addAll(list);
//        System.out.println("Các phần tử có trong list 1 là :" + list1);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("hi hô");
        list2.addAll(list);
        System.out.println("danh sách pHẦN tử list 2 hiện tại là:");
        list2.retainAll(list);
        System.out.println("xóa phần tử ko thuộc list :" + list2);
//
//        list2.add("ha ha");
//        list2.add("he he");
//        list2.add("hi hi");
//        System.out.println("phần tử hiện tại của list 2 là : " + list2);
//        list2.removeAll(list2);
//        System.out.println("phần tử của list 2 sau khi xóa là :" + list2);


        for (String element : list2){
            System.out.print("\t" + element + ",");
        }
        System.out.println();
        System.out.println(list2.get(1));

        System.out.println();

        list2.set(1,"mlem mlem");
        System.out.println(list2);

        System.out.println();

        list2.clear();
        System.out.println(list2);


    }
}
