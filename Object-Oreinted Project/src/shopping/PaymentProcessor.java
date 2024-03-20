package shopping;

public class PaymentProcessor {
    private Logger logger;

    public PaymentProcessor(Logger logger) {
        this.logger = logger;
    }

    public boolean processPayment(double amount, String paymentMethod) {
        if (isValidPaymentMethod(paymentMethod)) {
            switch (paymentMethod) {
                case "Credit Card":
                    logger.log("Credit card payment done.");
                    return true;
                case "Debit Card":
                    logger.log("Debit card payment done.");
                    return true;
                case "Cash":
                    logger.log("Cash payment done.");
                    return true;
                case "Applepay":
                    logger.log("Applepay payment done.");
                    return true;
                case "Samsungpay":
                    logger.log("Samsungpay payment done.");
                    return true;    
                case "Googlepay":
                    logger.log("Googlepay payment done.");
                    return true;
                
                    
                default:
                    logger.log("Unsupported payment method: " + paymentMethod);
                    break;
            }
        } else {
            logger.log("Invalid payment method: " + paymentMethod);
        }
        logger.log("Payment processing failed.");
        return false;
    }

    private boolean isValidPaymentMethod(String paymentMethod) {
        return paymentMethod != null && !paymentMethod.isEmpty();
    }
}
