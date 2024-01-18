package FundamentalJava.Collection;

import java.util.LinkedList;
import java.util.Stack;

public class StackandLinkedlist {
    public static void main(String[] args) {
       // Stack-List In First Out
//        push()-add,
//        pop()-only deleted Last element
//        Empty()-if return true if nothing is one the top of the stack(elsereturn False)
//        Peek()-Return top of the element in stack.
//        Search()-it is returns the position of the element(or else return -1)
//
//        Stack lifo=new Stack();//Generic
//        Stack<String> lifo1=new Stack<String>(); //non -generic
//        lifo.push("Annamalai");
//        lifo.push(968819782582l);
//        lifo.push(150);
//        lifo.push("Tamil");
//        System.out.println(lifo);
//        System.out.println(lifo+"before deleted values");
//        lifo.pop();
//        System.out.println(lifo+" after deleted values");
//
//
//        if(lifo1.empty()==true)
//        {
//            System.out.println(" your valu e is empty");
//        }
//        else
//        {
//            System.out.println("your value is not empty");
//        }
//
//        System.out.println(lifo.search(150));
//        System.out.println(lifo.peek());


//        linked list-duplicates Allowed,Maintained insertion Order,Synchronized not supported,Manipulation is Fast,perforamanced with index number
//  add/addLast ,  addFirst, add(index,object), remove/removeFirst, removeLast , remove(index), remove(object),contains-checking process
//			get(index), getFirst, getLast , set(index,object)// update, indexOf(object), clear()..........
        LinkedList<Integer> list=new LinkedList<Integer>();//Non-generic

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(17);
       list.add(17);
        list.add(18);
        list.addFirst(10);
        list.add(5,15);
        System.out.println("my value "+list);
        list.remove(0);
        list.remove();//First element will be removed
        list.removeLast();
        System.out.println("in my hand of values "+list);
        list.set(4,16);
        System.out.println("updated value "+list);
        System.out.println(list.get(2));

        list.clear();//deleted all elements
        System.out.println(list+" my value ");


    }
}
