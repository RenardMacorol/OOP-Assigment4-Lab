package OOP_Assigment4_Lab;

import java.util.Scanner;

public class Assignment4{
    /** 
    Assigment 4 Lab
    - Create a two user defined exeptions
    - that validates number of login of a user with a password
    - User only allowed to try to login in  3 tries
    - Exception 1: userExceeds "Maximum tries exceed. Try again later"
    - Exception 2: userValid "Wrong Password Try Again"
    **/
    String password = "Password";
    int  tries =3;
    public static void main(String[] args) {
      Assignment4 start = new Assignment4();
      start.login();
    }

    public void login(){
       while(tries!=0){
            Scanner s = new Scanner(System.in);
            try{
                
                System.out.println("Enter the Password: ");
                String input = s.nextLine();
                
                if(tries==1){
                    throw new userExceeds("Maximum tries exceed. Try again later"); 
                }
                else if(!password.equals(input)){
                    tries--;
                    throw new WrongPasswordException("Wrong Password");
                }
                System.out.println("Login Sucess");
                
                break;
            }catch(userExceeds exceed){
                System.out.println(exceed.getMessage());
                break;
            }catch(WrongPasswordException e){
                System.out.println("Error: "+ e.getMessage());
                System.out.println("No of Tries: "+tries);
                
            }
            
       }
    }
}