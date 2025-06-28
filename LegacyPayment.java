package paymentsystemadapter.paymentsystem;

public class LegacyPayment {
    public void makePayment(int amountInSYP, String customerId) {
        System.out.printf("[Legacy Syrian System] Processing: %,d SYP from %s%n", 
                         amountInSYP, customerId);
    }
}
