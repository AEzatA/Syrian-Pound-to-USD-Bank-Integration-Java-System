package paymentsystemadapter.paymentsystem;

public class SYPToUSDAdapter extends LegacyPayment {
    private static final double SYP_TO_USD_RATE = 0.0001;
    private final ThirdPartyPayment modernSystem;
    
    public SYPToUSDAdapter(ThirdPartyPayment modernSystem) {
        this.modernSystem = modernSystem;
    }
    
    @Override
    public void makePayment(int amountInSYP, String customerId) {
        double amountInUSD = amountInSYP * SYP_TO_USD_RATE;
        modernSystem.processPayment(amountInUSD, customerId);
    }
}
