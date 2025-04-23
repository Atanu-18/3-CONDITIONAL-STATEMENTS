import java.util.Scanner;

// if-else statement

public class Conditions1 {
    public static void main(String[] args) {

        //Q. Check adult or non-adult
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Non-Adult");
        }

        sc.close();
    }
    
}