/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Britney
 */
public class Login { 

    public static boolean checkUserName(String UserName) {
    
    boolean underscore = false ;
    boolean numCount   = false ; 
        int i;
    
    for (i =0; i <UserName.length(); i ++) {
      if (UserName.charAt(i) == 95)   {
      underscore = true;
      }
      if (UserName.length()<=5) {
      numCount = true ;
      }
    }
    if (underscore && numCount== true) {
    return true;
    }
    return false;
    }
    
    public static boolean checkPasswordComplexity(String Password) {
    
        boolean length = false ;
        boolean CapitalLetter = false ;
        boolean digit = false ;
        boolean specialchar = false;
        
        
     for (int j=0; j<Password.length(); j++)  {
      if (Password.length() >=8) {
      length =  true ;  
      }
      if (Password.charAt(j) >=65 && Password.charAt(j)<=90) {
       CapitalLetter = true;
      }
      if (Password.charAt(j)==95) {
      digit = true ;
      }
      if ((Password.charAt(j) >=37 && Password.charAt(j) <=47) || (Password.charAt(j) >=58 && Password.charAt(j) <=64) ||
          (Password.charAt(j) >=91 && Password.charAt(j) <=96) || (Password.charAt(j) >=123 && Password.charAt(j) <=126) ) {
          specialchar = true ;
      }
     }
     if (length && CapitalLetter &&digit && specialchar ==true ) {
        return true;
     
     }
     return false;
    }
    public static String registerUser( String UserName,String Password) {
      if(checkUserName(UserName)== true) {
      
      }
      else{
           return "The username is incorrectly formatted";
      }
      if ((checkUserName(UserName)== false)&& (checkPasswordComplexity(Password)==true)){
         System.out.println("Username or Password is incorrectly formatted");
      }
      else {
             return "The password does not meet the complexity requirements";
      }
      if (checkUserName(UserName) && checkPasswordComplexity(Password)==true) {
          System.out.println("The two above conditions have been met and the user is registered successfuly");
      }
      return "you are registered successfuly" ;
    }
    public static boolean loginUser(String UserName, String Password) {
        boolean loginUserName = false ;
        boolean loginPassword = false ;
        
      if (UserName.equals(UserName)) {
          
       loginUserName=true;
      }
      if(Password.equals(Password)) {
       loginPassword = true ;
      }
      if (loginUserName && loginPassword ==true){
        return true;
      
      }
      return false;
    }
    public static boolean returnLoginStatus(String UserName, String Password, String loginUserName, String loginPassword){
     if (loginUserName.equals(UserName) && loginPassword.equals(Password)==true){
      return true;
     }
     return false;
    }
    
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
    
      System.out.println("First Name: ");
      String firstname = input.nextLine();
      System.out.println("Last Name: ");
      String lastname = input.nextLine();
      
      System.out.println("Enter your Username");
      String UserName = input.nextLine();
      
      System.out.println("Enter your Password");
      String Password = input.nextLine();
      System.out.println("Enter your Username to login");
      String Username = input.nextLine();
    
      System.out.println("Enter your Password to login");
      String password = input.nextLine();
      checkPasswordComplexity(Password);
      if(checkUserName(UserName)&& checkPasswordComplexity(Password)==true);
      JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
//      This is where i am welcoi=ming the user to EasyKanban
      int option = Integer.parseInt(JOptionPane.showInputDialog(null,"Option 1)Add Task \n Option 2) Show Report \n Option 3) Quit" ));
      while (option < 3)
      if (option == 1)
      for(int i= 0; i < option; i++){
      { String numberOfTasks = JOptionPane.showInputDialog("How many Tasks?");
//      The usee will enter their task number 
       String taskName = JOptionPane.showInputDialog("What is your task Name?");
//       user will enter task name
       String taskDescription = JOptionPane.showInputDialog("Enter your task description");
//       User will enter task description
       String developerDetails = JOptionPane.showInputDialog("Enter Name and Surname");
//       User will enter their details
       int numberOfHours =  Integer.parseInt(JOptionPane.showInputDialog(null,"How many hours was your task?"));
       int b=input.nextInt();
       
       JOptionPane.showMessageDialog(null,taskName.substring(0,2) +":"+ i +":"+ developerDetails.substring(developerDetails.length()-3));
       
       int taskStatusOption = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your task status? \n 1) To Do \n 2) Done \n 3) Doing"));
       JOptionPane.showMessageDialog(null,"Task Status" + taskStatusOption +"/n"+developerDetails +"/n"+ taskDescription+"/n"+numberOfHours);
      }
      if (option==2){
      JOptionPane.showMessageDialog(null,"Coming Soon");
      }
      
    
         
      
      
    }
    }  
}
     