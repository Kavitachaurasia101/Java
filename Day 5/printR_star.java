//reverse star pattern....
import java.util.*;
class printR_star{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = s.nextInt();

        for(int row = number;row >= 1;row--){
            for(int column = 1;column<= row;column++){
                System.out.print("*");
            }
            System.out.println();
    }}
}