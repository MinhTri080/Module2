package List_demo.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("Element 4 :" + list.get(4));
        System.out.println("Element 2 :" + list.get(2));
        System.out.println("Element 1 :" + list.get(1));

        list.get(6);
        System.out.println("Element 6 :" + list.get(6));


        list.get(-1);
        System.out.println("Element -1 :" + list.get(-1));
    }
}
