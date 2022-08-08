//Create a stone paper scissor game with if else
//By taking input from 2 da players And print the results
import java.util.*;
class game{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("what do you want to choose? 0 for rock,1 for paper and 2 for scissor");
        int user_choice = s.nextInt();
        Scanner o = new Scanner(System.in);
        System.out.println("Enter other choice: ");
        int other_choice = o.nextInt();
        if(user_choice == other_choice){
            System.out.println("It's Draw");
        }
        else if((user_choice == 1) && (other_choice == 0)){
            System.out.println("you are win.");
        }
        else if((user_choice == 0) && (other_choice == 1)){
            System.out.println("you are lose.");
        }
        else if((user_choice == 1) && (other_choice == 2)){
            System.out.println("you are win.");
        }
        else if((user_choice == 2) && (other_choice == 1)) {
            System.out.println("you are lose.");
        }
        else if((user_choice == 0) && (other_choice == 2)) {
            System.out.println("you are win.");
        }
        else if((user_choice == 2) && (other_choice == 0)) {
            System.out.println("you are lose.");
        }
        else{
        System.out.println("Invalid number.");
    }
}}