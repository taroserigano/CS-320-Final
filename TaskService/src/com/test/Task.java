
package com.test;
/*
* Task class
* */
public class Task {
 
   private String taskID;
   private String name;
   private String description;
 
   
   public Task(String taskID,String name,String description) {
       if(isValidInput10(taskID)){
           this.taskID=taskID;
       }else{
           System.out.print("not valid");
       }
       if(isValidInput20(name)){
           this.name=name;
       }else{
           System.out.print("not valid");
       }
       if(isValidInput50(description)){
           this.description=description;
       }else{
           System.out.print("not valid");
       }
      
     
   }
   /*
   * This method will check the requirements
   *
   * */
   private boolean isValidInput10(String input) { 
       return input!=null&&input.length()<=10;  
   }
   private boolean isValidInput20(String input) { 
       return input!=null&&input.length()<=20;  
   }
   private boolean isValidInput50(String input) { 
       return input!=null&&input.length()<=50;  
   }
  

   
  
   public String getTaskID() {
	return taskID;
}
public void setTaskID(String taskID) {
	this.taskID = taskID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


   @Override
   public String toString(){
       return "["+taskID+","+name+","+description+"]";
   }
  

}