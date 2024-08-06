import java.util.Scanner;

public class Demo {
    // Exchange rates (as of a specific date; these are not real-time rates)
    private static final double USD_TO_EUR = 0.91;
    private static final double USD_TO_GBP = 0.78;
    private static final double USD_TO_JPY = 142.72;

    private static final double EUR_TO_USD = 1 / USD_TO_EUR;
    private static final double EUR_TO_GBP = USD_TO_GBP / USD_TO_EUR;
    private static final double EUR_TO_JPY = USD_TO_JPY / USD_TO_EUR;

    private static final double GBP_TO_USD = 1 / USD_TO_GBP;
    private static final double GBP_TO_EUR = USD_TO_EUR / USD_TO_GBP;
    private static final double GBP_TO_JPY = USD_TO_JPY / USD_TO_GBP;

    private static final double JPY_TO_USD = 1 / USD_TO_JPY;
    private static final double JPY_TO_EUR = USD_TO_EUR / USD_TO_JPY;
    private static final double JPY_TO_GBP = USD_TO_GBP / USD_TO_JPY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Select the source currency:");
        System.out.println("1. United States Dollar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. British Pound Sterling (GBP)");
        System.out.println("4. Japanese Yen (JPY)");
        int sourceCurrency = scanner.nextInt();

        System.out.println("Select the target currency:");
        System.out.println("1. United States Dollar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. British Pound Sterling (GBP)");
        System.out.println("4. Japanese Yen (JPY)");
        int targetCurrency = scanner.nextInt();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        System.out.printf("Converted amount: %.2f\n", convertedAmount);
    }

    public static double convertCurrency(double amount, int sourceCurrency, int targetCurrency) {
        if (sourceCurrency == targetCurrency) {
            return amount;
        }

        switch (sourceCurrency) {
            case 1: // USD
                return convertFromUSD(amount, targetCurrency);
            case 2: // EUR
                return convertFromEUR(amount, targetCurrency);
            case 3: // GBP
                return convertFromGBP(amount, targetCurrency);
            case 4: // JPY
                return convertFromJPY(amount, targetCurrency);
            default:
                throw new IllegalArgumentException("Invalid source currency");
        }
    }

    private static double convertFromUSD(double amount, int targetCurrency) {
        switch (targetCurrency) {
            case 2: // USD to EUR
                return amount * USD_TO_EUR;
            case 3: // USD to GBP
                return amount * USD_TO_GBP;
            case 4: // USD to JPY
                return amount * USD_TO_JPY;
            default:
                throw new IllegalArgumentException("Invalid target currency");
        }
    }

    private static double convertFromEUR(double amount, int targetCurrency) {
        switch (targetCurrency) {
            case 1: // EUR to USD
                return amount * EUR_TO_USD;
            case 3: // EUR to GBP
                return amount * EUR_TO_GBP;
            case 4: // EUR to JPY
                return amount * EUR_TO_JPY;
            default:
                throw new IllegalArgumentException("Invalid target currency");
        }
    }

    private static double convertFromGBP(double amount, int targetCurrency) {
        switch (targetCurrency) {
            case 1: // GBP to USD
                return amount * GBP_TO_USD;
            case 2: // GBP to EUR
                return amount * GBP_TO_EUR;
            case 4: // GBP to JPY
                return amount * GBP_TO_JPY;
            default:
                throw new IllegalArgumentException("Invalid target currency");
        }
    }

    private static double convertFromJPY(double amount, int targetCurrency) {
        switch (targetCurrency) {
            case 1: // JPY to USD
                return amount * JPY_TO_USD;
            case 2: // JPY to EUR
                return amount * JPY_TO_EUR;
            case 3: // JPY to GBP
                return amount * JPY_TO_GBP;
            default:
                throw new IllegalArgumentException("Invalid target currency");
        }
    }
}
