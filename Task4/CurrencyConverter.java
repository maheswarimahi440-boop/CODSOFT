import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Currency rates (base: USD)
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("INR", 83.0);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.78);
        rates.put("JPY", 155.0);

        System.out.println("Available currencies: USD, INR, EUR, GBP, JPY");

        // Input base currency
        System.out.print("Enter base currency: ");
        String base = sc.next().toUpperCase();

        // Input target currency
        System.out.print("Enter target currency: ");
        String target = sc.next().toUpperCase();

        // Validate
        if (!rates.containsKey(base) || !rates.containsKey(target)) {
            System.out.println("Invalid currency!");
            return;
        }

        // Input amount
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        // Convert
        double usdAmount = amount / rates.get(base);
        double converted = usdAmount * rates.get(target);

        // Output
        System.out.println("\nConverted Amount: " + converted + " " + target);

        sc.close();
    }
}