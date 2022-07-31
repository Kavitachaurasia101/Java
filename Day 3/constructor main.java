//constructor for diff data type
public class Main {
    void sum(int a,int b){ //creating a parameterized constructor
        System.out.println("your sum is: " + (a+b));
    }
    void sum(double a, double b){
        System.out.println("your sum is: " + (a+b));
    }
    public static void main(String[] args) {
        //creating objects and passing values
        Main m1 = new Main();
// here according to there data type they exec
        m1.sum(2,5);
        m1.sum(2.5,5.4);
    }
}
