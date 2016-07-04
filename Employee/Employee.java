public class Employee{
  private String name;
  private int age;
  private static int numberOfEmployees;
  
  public Employee(String name, int age){
    this.name = name;
    this.age = age;
    numberOfEmployees++;
  }//end cosnt. Employee
  
  public Employee(){
    this("Carlos",25);
  }//end cosnt. Employee
  
  public static int numOfCreatedEmployees(){
    return numberOfEmployees;
  }//end method numOfCreatedEmployees
  
  public String toString(){
    return name + " " + age;
  }//end method toString
}//end class Employee