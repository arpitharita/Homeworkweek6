package week_5;

//4. Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
public class Question_4{

    int a =15;//instance variable
    int b =5;
 static int c =10;//static variable
 static int d =20;

    public static void main (String args []){//main method
     Question_4 que = new Question_4();//create object
        que.add();
        System.out.println(que.a); //call instance variable using object name
        System.out.println(que.b);
         t1();//static variable direct
        Question_4.t1();//static variable via class name

    }
    void add(){ // instance method
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    static void t1(){//static method
        System.out.println(c);
        System.out.println(d);
        Question_4 que = new Question_4();
        System.out.println(que.a);
        System.out.println(que.b);
    }
}
