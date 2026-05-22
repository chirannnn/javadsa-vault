package com.lecture;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);

        queue.insert(3);
        queue.insert(2);
        queue.insert(7);
        queue.insert(8);
        queue.insert(4);
        queue.insert(19);

        queue.display();

        queue.remove();

        queue.display();
    }
}
