package week_5;

//   8. Write a program to insert any temperature value in degree Fahrenheit and convert
//to degree Celsius ((F − 32) × 5/9 = 0°C).

public class Question_8 {

    public static void main(String[] args) { // main method

        float n = 65;
        float celsius;
        celsius = ((n-32)*5)/9; //

        System.out.println("Convert Fahrenheit to celsius: " +celsius);
    }

}
