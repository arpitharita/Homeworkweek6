package week_5;

//5. Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)

public class Question_5 {


    public static void main(String[] args) {
        Question_5 que = new Question_5(); //Crate an object
        que.addition(40,10);
        que.subtraction(40,10);
        que.multiplication(40,10);
        que.division(40,10);
    }

    // 1. No return type with no parameters
    public void addition(int a, int b) {
       // System.out.println("Harita");
        System.out.println("Addition : " +(a+b));
    }

    // 2. No return type with parameters
    public void subtraction(int a, int b) {
        System.out.println("Subtraction :" +(a - b));

    }

    public static int multiplication(int a, int b) {
        int result1 = a * b;
        System.out.println("Multiplication :" +a*b);
        return result1;
    }
    public static int division(int a, int b) {
        int result =a/b;
        System.out.println("Division :" +result);
        return result;
    }
}