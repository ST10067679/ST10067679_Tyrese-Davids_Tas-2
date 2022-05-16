/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Britney
 */
public class Task {
    
 int var = 0;
 String taskDescription;
 String taskName;
 String developerDetails;
 int taskStatusOption;
 String productId;
 int b;
 int totalHours;
 int numberOfHours;
 int option;
 String numberOfTasks;
 
public boolean checkTaskDescription(){
//This method will check the length of the description and it cannot be longer the 50 
if (taskDescription.length()<=50){
return true;
}
return false;
}

public String createTaskId (){
return taskName.substring(0,2) +":"+ b +":"+ developerDetails.substring(developerDetails.length()-3);
}
//This method will take the first 2 and the last 3 letters of the users details

public String printTaskDetails(){
return "Task Status" + taskStatusOption +"/n"+developerDetails +"/n"+ taskDescription+"/n"+productId+"/n"+numberOfHours;
}

public int returnTotalHours(){
    return var;
//This method returns the total hours
}
}
    

