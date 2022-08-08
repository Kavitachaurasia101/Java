//Create a program to check whether the entered number is positive, negative or zero
import java.util.*;
class check_number{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int user = s.nextInt();
if (user < 0){
    System.out.println("The number is Negative");
}
else if(user == 0){
    System.out.println("The number is Zero.");
}
else{
    System.out.println("The number is Positive.");
}
    }
}