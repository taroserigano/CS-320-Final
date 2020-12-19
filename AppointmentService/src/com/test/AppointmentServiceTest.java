package com.test;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppointmentServiceTest {



   /* testing the add method to work*/
   @Test
   public void testAdd()  {
       AppointmentService cs = new AppointmentService();
       Date date = new GregorianCalendar(2014, Calendar.MARCH, 18).getTime();
       Appointment c1 = new Appointment("1", date, "Cooking Curry");

       

       assertEquals(true, cs.add(c1));
       // the repeating ID! must return false
       assertEquals(false, cs.add(c1));

       
       
   }

   /* test the delete method */
   @Test
   public void testDelete()  {
       AppointmentService cs = new AppointmentService();
	   Date date = new GregorianCalendar(2014, Calendar.MARCH, 18).getTime();
       Appointment c1 = new Appointment("1", date, "Let's brew Dr. Pepper party");
       
       assertEquals(true, cs.add(c1));
       //must return false
       assertEquals(false, cs.remove("666"));
       assertEquals(true, cs.remove("1"));
   }


   /* test the update method */
   @Test
   public void testUpdate()  {
       AppointmentService cs = new AppointmentService();
	   Date date = new GregorianCalendar(2014, Calendar.MARCH, 18).getTime();
	   Date Demondate = new GregorianCalendar(9999, Calendar.MARCH, 18).getTime();

       Appointment c1 = new Appointment("1", date, "Shredding in the key");
       assertEquals(true, cs.add(c1));

       assertEquals(true, cs.update("1", Demondate, "Watch out police"));
       
       assertEquals(false, cs.update("3", Demondate, "Watch out police"));

   }

  

}