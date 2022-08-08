//check whether the given word is vowel or constant using switch statement...
import java.util.*;
class Task {
    public static void main(String[] args) {
//        String a = (a,e,i,o,u);
        Scanner s = new Scanner(System.in);
        System.out.println("enter your word: ");
        String user = s.nextLine();
        switch (user) {
            case "a":
                System.out.println("It is a vowel a.");
                break;
            case "e":
                System.out.println("It is a vowel e.");
                break;
            case "i":
                System.out.println("It is a vowel i.");
                break;
            case "o":
                System.out.println("It is a vowel o.");
                break;
            case "u":
                System.out.println("It is a vowel u.");
                break;
            default:
                System.out.println("It is a constant.");

        }
    }
}