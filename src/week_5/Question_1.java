package week_5;
// Write a Java programme using the following steps.
  //      1.1 Declare two instance variables.
  //      1.2 Declare one instance method.
 //       1.3 Call both instance variables into the instance method inside the print
   //     statement. 1.4 Declare the Main method.
  //      1.5 Call the above instance method into the Main method and Run the programme.
public class Question_1 {

    int a =10;
    String name = "Harita";

    public static void main(String args[]){
        Question_1 que = new Question_1();
        que.p1();
    }
    void p1(){
        System.out.println(a);
        System.out.println(name);
    }
}

