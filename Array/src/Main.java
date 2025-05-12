import array.Array;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        Array array = new Array();
        array.add("ali");
        array.add("ahmed");
        array.add("mohammed");
        array.add(1, "hello");

        array.remove("ali's");
        array.remove(1);
        array.foreach();

//        ArrayList arrayList = new ArrayList();
//        arrayList.add("ali");
//        arrayList.add("ahmed");
//        arrayList.add("mohammed");
//        arrayList.add(1, "hello");
//
//        arrayList.remove("ali's");
//        arrayList.remove(1);
//        arrayList.forEach(System.out::println);


    }
}