/*  Name:   Amy O'Mara
 *  Date:   12/10/22
 *  Title:  Reverse a String iteratively and recursively
 *  Info:   Two method were created to reverse the string both iteratively and recursively
 */
public class tester{
    public static void main(String []args){
        String s = "Hello World";
        System.out.println("Iteratively Reversed String:    " + reverseIter(s));
        System.out.println("Recursively Reversed String:    " + reverseRecur(s));
    }
    //Method to reverse a string iteratively
    //using a for loop, each character is stored in a variable called result
    //starting with the last char in the string and moving backwards
    public static String reverseIter(String s){
        String result = "";
        for(int i = s.length()-1; i>=0; i--){
            result = result + s.charAt(i);
        }
        return result;
    }
    //Method to reverse a string recursively
    
    public static String reverseRecur(String s){
        if(s.length()==0){
            return "";
        }
        return s.substring(s.length()-1, s.length())+reverseRecur(s.substring(0,s.length()-1));
    }
}
