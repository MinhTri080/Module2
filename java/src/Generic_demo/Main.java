package Generic_demo;

import staticMethod.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Dictionary<String, String> d = new Dictionary<String, String>("Học", "Sinh");
//        String d1 = d.getKey();
//        String d2 = d.getValue();
//        System.out.println(d1 + " " + d2);
//
//        Book book = new Book<>("Di","Hoc");
//        Object b1 = book.getKey();
//        Object b2 = book.getValue();
//        System.out.println(b1 + " " + b2);

//        ClassStudent student = new ClassStudent(11,12);
//        Object I = student.getKey();
//        Object I1 = student.getValue();
//        System.out.println("Lop :" +I + " va Lop :" + I1);
//        Book<String,String,Integer> cls = new Book<>(" Hoc Sinh " ," Lop:c0322g1 ",13);
//        cls.getKey();
//        cls.getValue();
//        cls.getNum();
//        System.out.println(cls.getKey() +
//                            " "
//                            +cls.getValue() +
//                            "co' si~ so la"
//                            +cls.getNum()) ;
//
//
//
//
//        Generic1<Integer> test = new Generic1<Integer>();
//        test.add(5);
//        System.out.println(test.getObj());
//        Generic1<String> test1= new Generic1<String>();
//
//        test1.add("345");
//        System.out.println(test1.getObj());
//
//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add("65re");
//        arr.add("634");
//        arr.add("87");
//        arr.add("0987");
//        arr.add("876tr");
//        System.out.println(arr.toString());
        Set<HocSinh> hashsetStudent = new HashSet<>();
        hashsetStudent.add(new HocSinh(1));
        hashsetStudent.add(new HocSinh(1));
        System.out.println(hashsetStudent);
        HocSinh a = new HocSinh(1);
        HocSinh b = new HocSinh(1);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
    }

