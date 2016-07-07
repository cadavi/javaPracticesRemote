/*Write a method that takes as input a StringBuffer
and reverses it. For example, if the input string is abc, 
then the method will change the string to cba. 
The method should have void return type.*/
public class ReverseString{
  public static void main(String[] args){
    reverseStr(new StringBuffer("abc"));
  }//end method main
  
  public static void reverseStr(StringBuffer str){
    char aux;
    for(int i = str.length()-1, j = 0; i > 0; i--, j++){
      aux = str.charAt(j);
      str.setCharAt(j, str.charAt(i));
      //str.setCharAt(j, aux);
    }//end for
    //str.reverse();
    System.out.println(str);
  }//end method reverseStr
}//end class reverseString