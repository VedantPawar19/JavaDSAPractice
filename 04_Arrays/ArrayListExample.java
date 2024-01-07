import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list= new ArrayList<>(10);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.contains(40));
        list.set(0, 99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list.get(2));
        System.out.println(list);
    }
}