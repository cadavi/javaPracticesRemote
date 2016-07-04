public class Main{
  public static void main(String[] args){
    Employee emp = new Employee("Cesar", 13);
    System.out.println(emp);
    Employee emp2 = new Employee();
    System.out.println(emp2);
    Employee emp3 = new Employee("Frank", 38);
    System.out.println(emp3);
    System.out.println("Total of created employees: " + Employee.numOfCreatedEmployees());
  }//end main mehtod
}//end class Main