// star pattern....
import java.util.*;
class star_pattern{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = s.nextInt();
        for(int i = 0;i<number;i++){
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}