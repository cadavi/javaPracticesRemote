/*
Create a phone book program. Add capabilities for inserting a new name and phone
number, deleting a person from the directory, searching for the phone number of a person,
and reverse lookup (i.e., searching for a name by phone number). Create a Person class and
an ArrayList of people as part of the implementation.
 */
public class Person{
  private String name;
  private String phoneNumber;
  
  public Person(){
  }//end constr.
  
  public Person(String name, String phoneNumber){
    this.name = name;
    this.phoneNumber = phoneNumber;
  }//end constr.
  
  public Person(String name){
    this.name = name;
  }//end constr.
  
  
  public void setName(String name){
    this.name = name;
  }//end method setName
  
  public String getName(){
    return name;
  }//end method getName
  
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }//end method setPhoneNumber
  
  public String getPhoneNumber(){
    return phoneNumber;
  }//end method getPhoneNumber
  
  public String toString(){
    return name + " "+phoneNumber;
  }//end method toString
}//enc class Person