package com.seleniumTest.LinkedLists;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExampe
{
    public static void main(String[] args)
    {
        List linkedList1 = new LinkedList();
        linkedList1.add("String1");
        linkedList1.add(2);
        linkedList1.add(false);
        System.out.println(linkedList1);
        linkedList1.remove(1);
        System.out.println(linkedList1);
        linkedList1.removeAll(linkedList1);
        System.out.println(linkedList1);

        List<String> linkedList2 = new LinkedList<String>();
        linkedList2.add("String1");
        linkedList2.add("String2");
        linkedList2.add("String3");
        System.out.println(linkedList2);
        linkedList2.remove(1);
        System.out.println(linkedList2);

        LinkedList<String> linkedList3 = new LinkedList<String>();
        linkedList3.add("String1");
        linkedList3.add("String2");
        linkedList3.add("String3");
        System.out.println(linkedList3);
        linkedList3.remove(1);
        System.out.println(linkedList3);
    }
}
