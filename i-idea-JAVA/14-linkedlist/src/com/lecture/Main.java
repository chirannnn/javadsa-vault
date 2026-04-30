package com.lecture;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(32);
        list.insertLast(44);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insert(100, 3);

        list.display();
    }
}
