package FundamentalJava.Collection;

import java.util.ArrayList;
import java.util.Vector;

public class vectorandArraylist {
    //    set(index,object)// update,  add , addAll,  add(index,object), remove(index),   remove(object), contains ,get(index), indexOf(object), removeAll-only removed for original element, retainAll-only removed for dupliicates values
//    ArrayList bj=new ArrayList();

    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();

        list.add("Annamalai");
        list.add(27);
        list.add(5.4);
        list.add(96881982546l);
        list.add('M');
        System.out.println(list);



        Vector list1=new Vector();

        list1.addAll(list);
        list1.add("Tamil");
        list1.add(978987852421l);

        System.out.println(" my arralist value "+list);
        System.out.println("my vector value is "+list1);

        list1.remove("Tamil");
        System.out.println("Arraylist remove and original values :"+list1);

        list1.removeAll(list);//only removed for original element
        System.out.println(list1);

        list1.retainAll(list);
        System.out.println(list1);//only removed duplicates element




    }

}
