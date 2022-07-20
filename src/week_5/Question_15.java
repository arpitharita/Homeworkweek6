package week_5;

//Write a Java program to swap two variables.

public class Question_15 {

    public static void main(String[] args) { // main method

        int x = 20, y = 30; //local variable

        System.out.println("Before Swap"); //printing statment
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
