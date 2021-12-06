package nestedclass;

public class PaymentProcessing {
    public String paymentType;
    public void paymentMethod(String paymentType){
        this.paymentType = paymentType;
    }
    public void makePayment(){
        if(paymentType.equalsIgnoreCase("cash")){
            PayByCash.processCashPayment();
        }else if(paymentType.equalsIgnoreCase("debitcard")){
            PayByDebitCard.processDebitCardPayment();
        }else if(paymentType.equalsIgnoreCase("paypal")){
            PayByPaypal.processPaypalPayment();
        }else if(paymentType.equalsIgnoreCase("creditcard")){
            PayByCreditCard.processCreditCardPayment();
        }else if(paymentType.equalsIgnoreCase("crypto")){
            PayByCrypto.processCryptoPayment();
      }
    }

    private static class PayByCash{

        public static void processCashPayment(){
            System.out.println("accept cash from customer and return the change");
        }
    }
    private static class PayByPaypal{

        public static void processPaypalPayment(){
            System.out.println("accept paypal from customer for payment");
        }
    }
    private static class PayByDebitCard{

        public static void processDebitCardPayment(){
            System.out.println("accept debit card from customer by swiping and 4 digits pin");
        }
    }
    private static class PayByCreditCard{

        public static void processCreditCardPayment(){
            System.out.println("accept credit card from customer and swipe in visa/mastercard terminal");
        }
    }
    private static class PayByCrypto{

        public static void processCryptoPayment(){
            System.out.println("accept crypto from customer using digital wallet");
        }
    }
}
