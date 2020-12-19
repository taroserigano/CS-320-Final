
package com.test;
/*
* This is Contact class
* */
public class Contact {


   private String contactID;
   private String firstName;
   private String lastName;
   private String phone;
   private String address;
  
   /*
   * The constructor has 5 arguments and
   * validator will verify the requirement for each
   * */
   public Contact(String contactID,String firstName,String lastName,String phone,String address) {
       if(isValidInput(contactID)){
           this.contactID=contactID;
       }else{
           System.out.print("not valid");
       }
       if(isValidInput(firstName)){
           this.firstName=firstName;
       }else{
           System.out.print("not valid");
       }
       if(isValidInput(lastName)){
           this.lastName=lastName;
       }else{
           System.out.print("not valid");
       }
      
       if(phone!=null&&phone.length()==10){
           this.phone=phone;
       }else{
           System.out.print("not valid");
       }
       if(address!=null&&address.length()<=30){
           this.address=address;
       }else{
           System.out.print("not valid");
       }
      
   }
   /*
   * This method will verify the requirements
   *
   * */
   private boolean isValidInput(String input) {
      
       return input!=null&&input.length()<=10;
      
   }
  
 

   public String getFirstName() {
       return firstName;
   }
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
  
   public String getLastName() {
       return lastName;
   }
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
  
   public String getPhone() {
       return phone;
   }
   public void setPhone(String phone) {
       this.phone = phone;
   }
  
  
   public String getAddress() {
       return address;
   }
   public void setAddress(String address) {
       this.address = address;
   }
  
 
   public String getContactID() {
       return contactID;
   }
  

   @Override
   public String toString(){
       return "["+contactID+","+firstName+","+lastName+","+phone+","+address+"]";
   }
  

}