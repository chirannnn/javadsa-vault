package com.lecture;


public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(32);
//        list.insertLast(44);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insert(100, 3);
//        list.deleteFirst();
//        list.deleteLast();
//        list.delete(2);
//        System.out.println(list.find(2));
//
//        list.display();


//        DLL list = new DLL();
//        list.insertFirst(32);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertLast(99);
//        list.insert(99, 100);
//
//        list.display();

        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.delete(3);

        list.display();
    }
}
