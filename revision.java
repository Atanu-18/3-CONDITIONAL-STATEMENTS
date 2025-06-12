import java.util.Scanner;

public class revision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int operator = sc.nextInt();

        switch(operator) {
            case 1:
                System.out.println("the addion of two no : " + (n1+n2));
                break;
            case 2:
                System.out.println("the difference of two no : " + (n1-n2));
                break;
            case 3:
                System.out.println("the multiplication of two no : " + (n1*n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("this is invalid division");
                } else {
                    System.out.println("the division of two no : " + (n1/n2));
                }
                break;
            case 5:
                if (n2 == 0) {
                    System.out.println("this is invalid modulus");
                } else {
                    System.out.println("the mod of two no : " + (n1%n2));
                }
                break;
        }

        sc.close();
    }
}