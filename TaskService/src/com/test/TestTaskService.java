package com.test;


/*
* This is Test class
* */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestTaskService {

   /* testing the add method to work*/
   @Test
   public void C()  {
       TaskService cs = new TaskService();
       Task c1 = new Task("1", "Playing Guitar", "Shredding is the key");

       assertEquals(true, cs.add(c1));
      
   }

   /* testing the add method to work*/
   @Test
   public void testAdd()  {
       TaskService cs = new TaskService();
       Task c1 = new Task("1", "Playing Guitar", "Shredding is the key");
       
       assertEquals(true, cs.add(c1));
       assertEquals(false, cs.add(c1));
       
   }

   /* test the delete method */
   @Test
   public void testDelete()  {
       TaskService cs = new TaskService();
       Task c1 = new Task("1", "Playing Guitar", "Shredding is the key");
       
       assertEquals(true, cs.add(c1));
       //must return FALSE as the ID doesn't exist
       
       assertEquals(false, cs.remove("666"));
       assertEquals(true, cs.remove("1"));
       
   }


   /* test the update method */
   @Test
   public void testUpdate()  {
       TaskService cs = new TaskService();
       Task c1 = new Task("1", "Playing Guitar", "Shredding is the key");
       assertEquals(true, cs.add(c1));
       
       // ID is WRONG! must return False :p
       assertEquals(false, cs.update("2", "Vomit", "Watch out police"));
       assertEquals(true, cs.update("1", "Vomit", "Watch out police"));
       
   }

  

}