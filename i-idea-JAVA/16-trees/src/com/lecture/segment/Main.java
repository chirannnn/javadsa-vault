package com.lecture.segment;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 3, 2, 5};

        SegmentTree tree = new SegmentTree(arr);

        System.out.println(tree.query(0, 2));
        tree.display();
    }
}
