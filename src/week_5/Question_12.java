package week_5;

//Write a Java program to compute the specified expressions and print the
//        output.
//        Test Data:
//        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//        Expected Output : 2.138888888888889

public class Question_12 {

    public static void main(String[] args) { // main method

        double a = 25.5; // declare local variable
        double b = 3.5;
        float  c = 40.5f; // declare local variable
        float  d = 4.5f;
       // System.out.println("Test data: +((25.5*3.5-3.5*3.5)/(40.5-4.5))");
        System.out.println("Expexted result " +((a*b-b*b)/(c-d)));


    }
}
