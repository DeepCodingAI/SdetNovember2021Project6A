package nestedclass;

import java.util.Scanner;

public class PaymentInformationSystem {
    public static void main(String[] args) {
        PaymentProcessing paymentProcessing = new PaymentProcessing();
        System.out.println("How do you like to make the payment: 1) Cash 2) Paypal 3) DebitCard 4)CreditCard 5)Crypto");
        Scanner sc = new Scanner(System.in);
        paymentProcessing.paymentType = sc.next();
        paymentProcessing.makePayment();
    }
}
