package com.test;


import static org.junit.Assert.*;
import org.junit.Test;

public class ContactServiceTest {

   /* testing the add method to work fine, when details provided should work */
   @Test
   public void Constructor()  {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("1", "Taro", "Serigano","1234567890", "Taroron Seven  ST");

       assertEquals(true, cs.add(c1));
      
   }

   /* testing the add method to work fine,when details provided should not work */
   @Test
   public void testAdd()  {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("1", "Taro", "Serigano", "1234567890", "Taroron Seven  ST");
       Contact c2 = new Contact("1", "TaroTaroTaro", "SeriganoSerigano", "1234567890000", "Taroron Seven  ST");

       assertEquals(true, cs.add(c1));
       //must return FALSE as the "c2's" ID is identical with "c1"
       assertEquals(false, cs.add(c2));
       
   }

   /* test the delete method */
   @Test
   public void testMethodDelete()  {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("1", "Taro", "Serigano","1234567890", "Taroron Seven  ST");
       
       assertEquals(true, cs.add(c1));
       
       //must return FALSE as the ID does Not exist
       assertEquals(false, cs.remove("666"));
       assertEquals(true, cs.remove("1"));
   }


   /* test the update method */
   @Test
   public void testUpdatePass()  {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("1", "Taro", "Serigano","1234567890", "Taroron Seven  ST");
       assertEquals(true, cs.add(c1));
       
       //must return FALSE as the ID does Not exist
       assertEquals(false, cs.update("666", "Sean", "Paul", "2234567890", "LA"));       
       assertEquals(true, cs.update("1", "Sean", "Paul", "2234567890", "LA"));
   }

  

}