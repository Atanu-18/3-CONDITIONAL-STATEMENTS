import java.util.Scanner;

//Q. check 2 no's are equal or not

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
                System.out.println("a is greater than b");
        }
         else {
                System.out.println("a is lesser than b");
        }
        


        sc.close();
    }
}
