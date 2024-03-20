package shopping;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void testProcessPaymentSuccess() {
        MockLogger logger = new MockLogger();
        PaymentProcessor paymentProcessor = new PaymentProcessor(logger);
        double amount = 100.0;
        String paymentMethod = "Credit Card";

        assertTrue(paymentProcessor.processPayment(amount, paymentMethod));
        assertEquals("Processing payment of $100.0 via Credit Card", logger.getLog());
        assertEquals("Payment successful.", logger.getLog());
    }

    @Test
    public void testProcessPaymentInvalidAmount() {
        MockLogger logger = new MockLogger();
        PaymentProcessor paymentProcessor = new PaymentProcessor(logger);
        double invalidAmount = -50.0;
        String paymentMethod = "Credit Card";

        assertFalse(paymentProcessor.processPayment(invalidAmount, paymentMethod));
        assertEquals("Invalid payment amount.", logger.getLog());
        assertEquals("Payment processing failed.", logger.getLog());
    }

    @Test
    public void testProcessPaymentInvalidMethod() {
        MockLogger logger = new MockLogger();
        PaymentProcessor paymentProcessor = new PaymentProcessor(logger);
        double amount = 50.0;
        String invalidMethod = "Invalid Method";

        assertFalse(paymentProcessor.processPayment(amount, invalidMethod));
        assertEquals("Invalid payment method.", logger.getLog());
        assertEquals("Payment processing failed.", logger.getLog());
    }

    private static class MockLogger implements Logger {
        private StringBuilder logBuilder = new StringBuilder();

        @Override
        public void log(String message) {
            logBuilder.append(message).append("\n");
        }

        @Override
        public void logUserLogin(String username) {
            String welcomeMessage = "Welcome, " + username + "!"; 
            log(welcomeMessage); 
        }

        public String getLog() {
            return logBuilder.toString().trim();
        }
    }
}
