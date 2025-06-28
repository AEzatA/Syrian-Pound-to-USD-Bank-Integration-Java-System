package paymentsystemadapter.paymentsystem;

public class PaymentSystem {

    public static void main(String[] args) {
        // Create systems
        LegacyPayment syrianSystem = new LegacyPayment();
        ThirdPartyPayment usSystem = new ThirdPartyPayment();
        SYPToUSDAdapter adapter = new SYPToUSDAdapter(usSystem);
        
        // Process payments
        System.out.println("--- Syrian System (Direct) ---");
        syrianSystem.makePayment(1_000_000, "Ahmad444084"); 
        
        System.out.println("\n--- US System via Adapter ---");
        adapter.makePayment(1_000_000, "Ahmad444084"); 
        
        System.out.println("\n--- US System (Direct) ---");
        usSystem.processPayment(100.00, "Ahmad444084"); 
    }
}
