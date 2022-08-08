//Create a grading system where u have to take an input from the user about marks
// and assign the grade according to it
import java.util.*;
class grading{
    public static void main(String[] args){
     Scanner s = new Scanner(System.in);
        System.out.println("Enter The Marks: ");
     float user = s.nextFloat();
     if (user>=75){
         System.out.println("Your Grade is 'A'.");
     }
     else if(user>=65){
         System.out.println("Your Grade is 'B'.");
     }
     else if(user>=55){
         System.out.println("Your Grade is 'C'.");
     }
     else if(user>=45){
         System.out.println("Your Grade is 'D'.");
     }
     else if(user>=33){
         System.out.println("Your Grade is 'E'.");
     }
     else{
         System.out.println("you are fail.");
     }

}}