package com.test;
import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
	//arrayList
   private ArrayList<Appointment> Appointments;
      
   //default constructor
     public AppointmentService() {
       Appointments = new ArrayList<>();
   }
   //add method
   public boolean add(Appointment Appointment) {
       boolean alreadyPresent = false;
       for (Appointment c : Appointments) {
           if (c.equals(Appointment)) {
               alreadyPresent = true;
           }
       }
       if (!alreadyPresent) {
           Appointments.add(Appointment);
           System.out.println("Appointment Added Successfully!");
           return true;
       } else {
           System.out.println("Appointment already present");
           return false;
       }
   }

   public boolean remove(String AppointmentID) {
       for (Appointment c : Appointments) {
           if (c.getID().equals(AppointmentID)) {
               Appointments.remove(c);
               System.out.println("Appointment removed Successfully!");
               return true;
           }
       }
       System.out.println("Appointment not present");
       return false;
   }


   public boolean update(String AppointmentID, Date date, String description) {
       for (Appointment c : Appointments) {
           if (c.getID().equals(AppointmentID)) {
              
               if (!description.equals(""))
                   c.setDescription(description);
                   c.setDate(date);
                
               System.out.println("Appointment updated Successfully!");
               return true;
           }
       }
       System.out.println("Appointment not present");
       return false;
   }

}

  