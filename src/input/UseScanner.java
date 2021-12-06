package input;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println(result);
        System.out.println("What is your name: ");
        String name = sc.next();
        System.out.println("So your name is " + name);
        System.out.println("End of Scanner obj");
    }
}
