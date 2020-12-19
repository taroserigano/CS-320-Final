package com.test;
import java.util.ArrayList;

public class ContactService {
   /* this contains a list of contacts */
   private ArrayList<Contact> contacts;

   /* default constructor */
   public ContactService() {
       contacts = new ArrayList<>();
   }

   /* this method adds a given contact to our list if its not already present */
   public boolean add(Contact contact) {
       /* first we determine if the contact is already present */
       boolean alreadyPresent = false;
       for (Contact c : contacts) {
           if (c.getContactID().equals(contact.getContactID())) {
               alreadyPresent = true;
           }
       }
       /* if the contact is not present then we add it, and return true */
       if (!alreadyPresent) {
           contacts.add(contact);
           System.out.println("Contact Added Successfully!");
           return true;
       } else {
           System.out.println("Contact already present");
           return false;
       }
   }

   /* this method remove a contact with given contactId if present in our list */
   public boolean remove(String contactID) {
       for (Contact c : contacts) {
           if (c.getContactID().equals(contactID)) {
               contacts.remove(c);
               System.out.println("Contact removed Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
       return false;
   }

  
   public boolean update(String contactID, String firstName, String lastName, String phone, String address) {
       for (Contact c : contacts) {
           if (c.getContactID().equals(contactID)) {
               if (!firstName.equals(""))
                   c.setFirstName(firstName);
               if (!lastName.equals(""))
                   c.setLastName(lastName);
               if (!phone.equals(""))
            	   c.setPhone(phone);
               if (!address.equals(""))
                   c.setAddress(address);
               
               System.out.println("Contact updated Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
       return false;
   }

}

  