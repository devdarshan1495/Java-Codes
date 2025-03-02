

import java.util.*;
public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("AA");
        list1.add("BB");
        list1.add("CC");
        list1.add("DD");
        System.out.println("List 1 - "+list1);
 
        list1.add(1, "ZZ");
        System.out.println("List 1 now - " +list1);

        ArrayList<String> list2 = new ArrayList<>(2);
        list1.add("EE");
        list1.add("FF");
        list1.add("GG");
        System.out.println("List 2 - "+list2);

        ArrayList<String> list3 = new ArrayList<>(list2);
        System.out.println("List 3 - "+list3);

        list3.addAll(list1);
        System.out.println("List 3 - "+list3);
    }
}