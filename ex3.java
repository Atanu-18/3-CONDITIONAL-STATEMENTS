import java.util.Scanner;
//Q. button test by if-else condition......
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if(button == 3){
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid button");
        }
        
        


        sc.close();
    }
}
