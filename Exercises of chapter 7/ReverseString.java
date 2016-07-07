/*Write a method that takes as input a StringBuffer
and reverses it. For example, if the input string is abc, 
then the method will change the string to cba. 
The method should have void return type.*/
public class ReverseString{
  public static void main(String[] args){
    reverseStr(new StringBuffer("abc"));
  }//end method main
  
  public static void reverseStr(StringBuffer str){
    StringBuffer stB = new StringBuffer();
    for(int i = str.length()-1, j = 0; i >= 0; --i, --j){
      stB.append(str.charAt(i));
    }//end for
    str = new StringBuffer(stB);
    System.out.println(str);
    //str.reverse();
  }//end method reverseStr
  
  public static void easyWay(StringBuffer str){
    str.reverse();
    System.out.println(str);
  }//end method easyWay
}//end class reverseString