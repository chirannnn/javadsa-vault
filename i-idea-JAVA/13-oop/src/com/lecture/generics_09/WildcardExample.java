package com.lecture.generics_09;

import com.lecture.properties_05.polymorphism.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

// here T should either be Number or its subclasses
public class WildcardExample<T extends Integer> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Numbers> list) {
        // do something
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();

//        CustomGenArrayList list = new CustomGenArrayList();

//        list.add(2);
//        list.add(3);
//        list.add(4);

//        for (int i = 0; i < 15; i++) {
//            list.add(i * 2);
//        }
//
//        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("Ohhh");

        WildcardExample<Integer> list3 = new WildcardExample<>();

        for (int i = 0; i < 15; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);
    }
}
