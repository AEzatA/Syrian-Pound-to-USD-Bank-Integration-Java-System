package paymentsystemadapter.paymentsystem;

public class ThirdPartyPayment {
    public void processPayment(double amountInUSD, String userId) {
        System.out.printf("[Modern US System] Charging $%,.2f from %s%n", 
                         amountInUSD, userId);
    }
}
