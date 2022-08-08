// input from user through scanner
import java.util.*;
class inputscan{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String user = s.nextLine();
        System.out.println("enter your age: ");
        int age = s.nextInt();
        System.out.println("your name and age is " + user +" " + age);

    }
}