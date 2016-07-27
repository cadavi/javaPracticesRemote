/*
Create a phone book program. Add capabilities for inserting a new name and phone
number, deleting a person from the directory, searching for the phone number of a person,
and reverse lookup (i.e., searching for a name by phone number). Create a Person class and
an ArrayList of people as part of the implementation.
*/
import java.util.*;
public class PhoneBook{
  ArrayList<Person> person = new ArrayList<Person>();
  
  public PhoneBook(){
  }//end constr. 
  
  public PhoneBook(ArrayList<Person> person){
    this.person = person;
  }//end constr.
  
  public void addNameAndPhoneNumber(String name, String phoneNumber){
    person.add(new Person(name, phoneNumber));
  }//end method addPhoneNumber
  
  public void deletePersonByPhoneNumber(String name, String phoneNumber){
    person.remove(new Person(name, phoneNumber));
  }//end method
}//end class PhoneBook