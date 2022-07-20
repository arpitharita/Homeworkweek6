package week_5;

// Write a Java program that takes a number as input and prints its
//        multiplication table up to 10.
//        Test Data: Input a number: 8
//        Expected Output :
//
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ... double area=math.PI
//        8 x 10 = 80

import java.util.Scanner;

public class Question_10 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number you want to print table");
        int no = s.nextInt();
        int i;
        for (i = 1; i <=10; i++)

        System.out.println(no+"x"+i+"="+no*i);
    }
}
