public class Complex{
  private double realPart;
  private double imaginaryPart;
  
  public Complex(){
  }//end const. Complex
  
  public Complex(double realPart, double imaginaryPart){
    this.realPart  = realPart;
    this.imaginaryPart = imaginaryPart; 
  }//end const. Complex
  
  public boolean equals(Complex complex){
    return (complex.realPart == this.realPart
            && complex.imaginaryPart == this.imaginaryPart);
  }//end method equals
  
  public Complex add(Complex comp){
    Complex result = new Complex();
    result.realPart = this.realPart + comp.realPart;
    result.imaginaryPart = this.imaginaryPart + comp.imaginaryPart;
    return result; 
  }//end method add
  
  public static Complex add(Complex c1, Complex c2){
    Complex result = new Complex();
    result.realPart = c1.realPart + c2.realPart;
    result.imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
    return result;
  }//end method add
  
  public Complex sustract(Complex comp){
    Complex result = new Complex();
    result.realPart = this.realPart - comp.realPart;
    result.imaginaryPart = this.imaginaryPart - comp.imaginaryPart;
    return result; 
  }//end method sustract
  
  public static Complex sustract(Complex c1, Complex c2){
    Complex result = new Complex();
    result.realPart = c1.realPart - c2.realPart;
    result.imaginaryPart = c1.imaginaryPart - c2.imaginaryPart;
    return result;
  }//end method sustract
  
  public String toString(){
    return realPart + " + " + imaginaryPart+"i";
  }//end method toString
}//end class Complex