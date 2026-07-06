package com.lecture.introduction;

public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.populate();
//        tree.display();
//        tree.prettyDisplay();

//        int[] values = {3, 7, 5, 9, 0, 1};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        BST tree = new BST();
        tree.populateSorted(values);
        tree.display();
    }
}
