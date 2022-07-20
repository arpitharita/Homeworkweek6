package week_5;


import java.io.PrintStream;

//3. Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//
//3.4 Call both instance and static variables i
//nto both instance and static methods inside the print statement.
//3.5 Declare the Main method.
 //     3.6 Call both instance and static methods into the Main method and run the programme.
public class Question_3 {
      int a =10; //declare instance variable
    static String name ="Harita" ;//declare ststic method
    public static void main(String args[]) { //main method
      Question_3 que =new Question_3();
      que.add();

        System.out.println(que.a); //call local variabe
        System.out.println(name); // call static variaable

    }

    void add(){
        Question_3 que =  new Question_3(); //Create an object
        System.out.println(que.a);// call variable using object
        System.out.println(name);



    }
}
