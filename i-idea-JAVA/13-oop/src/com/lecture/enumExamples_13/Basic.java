package com.lecture.enumExamples_13;

public class Basic{


    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week

        void hello() {

        }

        Week() {
            System.out.println("Constructor is called for " + this);
        }

        @Override
        public void display() {
            System.out.println("How are you");
        }

        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week = Week.Friday;

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());

        System.out.println(Week.valueOf("Friday"));

        week.display();
    }
}
