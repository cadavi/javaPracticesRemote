public class Main{
  public static void main(String[] args){
    Complex c1  = new Complex(5,5);
    Complex c2  = new Complex(5,5);
    if(c1.equals(c2)){
        System.out.print("Sum: ");
        Complex result = c1.add(c2);
        System.out.println(result);
        System.out.print("Rest: ");
        result = c1.sustract(c2);
        System.out.println(result);
        System.out.println("Sum Statics: " + Complex.add(c1,c2));
        System.out.println("Sum Statics: " + Complex.sustract(c1,c2));
    }//end if
  }//end main method
}//end class Main