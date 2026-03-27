package com.lecture.properties_05.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

    public static void main(String[] args) {
        BoxPrice box = new BoxPrice();

        BoxPrice box2 = new BoxPrice(1, 2, 3, 4, 5);
        System.out.println(box2.h);

//        Box box3 = new BoxPrice();
//        BoxPrice box4 = new BoxPrice(box3);

    }
}
