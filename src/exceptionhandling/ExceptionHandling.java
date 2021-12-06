package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Please enter a number that you want to divide by: ");
        Scanner sc = new Scanner(System.in);
        int number = 10;
        int divideBy = sc.nextInt();
       try {
            int result = number / divideBy;
            System.out.println(result);
        }catch (Exception ex){
            System.out.println("You can not divide a number by zero, it is a run time arithmetic error");
        }
        System.out.println("Please continue using the application");
    }
}
