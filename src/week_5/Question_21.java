package week_5;

//Make class save your name in string variable and use all string methods.

public class Question_21 {

    public static void main(String[] args) {
         String str = "My name is Harita"; //declare locAL variable
         String str1 = "    Patel   ";
         String str2 ="MY NAME IS HARITA";

        System.out.println("1. Length of string is : " +str.length()); /* printing statment with method*/
        System.out.println("2. Return a char value :" +str.charAt(5));
        System.out.println("3. Combines specified string:" +str.concat(str1));
        System.out.println("4. Return true if char are found in string :" +str.contains("My"));
        System.out.println("5. Check if this string starts with given prefix :"+str.startsWith("M"));
        System.out.println("6. Check if this string end with given suffix :" +str.endsWith("a"));
        System.out.println("7. Compres the contents of two given string :" +str.equals(str1));
        System.out.println("8. Returns index of given charecter value of substring : " +str.indexOf("name"));
        System.out.println("9. Check if this string is empty :" +str.isEmpty());
        System.out.println("10. Returns a string replacing all the old char to new char :" +str.replace('e','s'));
        System.out.println("11. Returns a part of the string :" +str.substring(5,10));
        char[] array=str.toCharArray();
        //12.Convert this string into character
        for(char c : array)
        {
            System.out.println(c);
    }
        System.out.println("13. Returns"+str2.toLowerCase());
        System.out.println("14. Return the string is uppercase" +str1.toUpperCase());
        System.out.println("15. Eliminates leading and traling spaces"+str1.trim());


        }
    }