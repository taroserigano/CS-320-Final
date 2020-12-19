package com.test;
import java.util.ArrayList;

public class TaskService {
   /* this contains a list of tasks */
   private ArrayList<Task> tasks;

   /* default constructor */
   public TaskService() {
       tasks = new ArrayList<>();
   }

   /* this method adds a given task to our list if its not already present */
   public boolean add(Task task) {
       /* first we determine if the task is already present */
       boolean alreadyPresent = false;
       for (Task c : tasks) {
           if (c.equals(task)) {
               alreadyPresent = true;
           }
       }
       if (!alreadyPresent) {
           tasks.add(task);
           System.out.println("task Added Successfully!");
           return true;
       } else {
           System.out.println("task already present");
           return false;
       }
   }

   public boolean remove(String taskID) {
       for (Task c : tasks) {
           if (c.getTaskID().equals(taskID)) {
               tasks.remove(c);
               System.out.println("task removed Successfully!");
               return true;
           }
       }
       System.out.println("task not present");
       return false;
   }


   public boolean update(String taskID, String name, String description) {
       for (Task c : tasks) {
           if (c.getTaskID().equals(taskID)) {
               if (!name.equals(""))
                   c.setName(name);
               if (!description.equals(""))
                   c.setDescription(description);
                
               System.out.println("task updated Successfully!");
               return true;
           }
       }
       System.out.println("task not present");
       return false;
   }

}

  