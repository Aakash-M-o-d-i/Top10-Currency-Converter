import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CurrencyConverter {
    // adding all country currency using " USD TO ALL country currency".
    private static final double USD_TO_EUR = 0.91; // EURO
    private static final double USD_TO_GBP = 0.78; // BRITAIN
    private static final double USD_TO_JPY = 142.72; // JAPAN
    private static final double USD_TO_IND = 83.91; // INDIA
    private static final double USD_TO_CHF = 0.85; //  SWISS FRANC
    private static final double USD_TO_CAN = 1.38; // CANDA
    private static final double USD_TO_AUS = 1.53; // AUSTRALIA
    private static final double USD_TO_CHA = 7.15; // CHINA
    private static final double USD_TO_BRA = 5.72; // Brazilian Real




    // implement formula to convert the currency.
    // Euro
    private static final double EUR_TO_USD = 1 / USD_TO_EUR;
    private static final double EUR_TO_GBP = USD_TO_GBP / USD_TO_EUR;
    private static final double EUR_TO_JPY = USD_TO_JPY / USD_TO_EUR;
    private static final double EUR_TO_IND = USD_TO_IND / USD_TO_EUR;
    private static final double EUR_TO_CHF = USD_TO_CHF / USD_TO_EUR;
    private static final double EUR_TO_CAN = USD_TO_CAN / USD_TO_EUR;
    private static final double EUR_TO_AUS = USD_TO_AUS / USD_TO_EUR;
    private static final double EUR_TO_CHA = USD_TO_CHA / USD_TO_EUR;
    private static final double EUR_TO_BRA = USD_TO_BRA / USD_TO_EUR;

    // Britain
    private static final double GBP_TO_USD = 1 / USD_TO_GBP;
    private static final double GBP_TO_EUR = USD_TO_EUR / USD_TO_GBP;
    private static final double GBP_TO_JPY = USD_TO_JPY / USD_TO_GBP;
    private static final double GBP_TO_IND = USD_TO_IND / USD_TO_GBP;
    private static final double GBP_TO_CHF = USD_TO_CHF / USD_TO_GBP;
    private static final double GBP_TO_CAN = USD_TO_CAN / USD_TO_GBP;
    private static final double GBP_TO_AUS = USD_TO_AUS / USD_TO_GBP;
    private static final double GBP_TO_CHA = USD_TO_CHA / USD_TO_GBP;
    private static final double GBP_TO_BRA = USD_TO_BRA / USD_TO_GBP;

    // Japan
    private static final double JPY_TO_USD = 1 / USD_TO_JPY;
    private static final double JPY_TO_EUR = USD_TO_EUR / USD_TO_JPY;
    private static final double JPY_TO_GBP = USD_TO_GBP / USD_TO_JPY;
    private static final double JPY_TO_IND = USD_TO_IND / USD_TO_JPY;
    private static final double JPY_TO_CHF = USD_TO_CHF / USD_TO_JPY;
    private static final double JPY_TO_CAN = USD_TO_CAN / USD_TO_JPY;
    private static final double JPY_TO_AUS = USD_TO_AUS / USD_TO_JPY;
    private static final double JPY_TO_CHA = USD_TO_CHA / USD_TO_JPY;
    private static final double JPY_TO_BRA = USD_TO_BRA / USD_TO_JPY;
    // india
    private static final double IND_TO_USD = 1 / USD_TO_IND;
    private static final double IND_TO_EUR = USD_TO_EUR / USD_TO_IND;
    private static final double IND_TO_GBP = USD_TO_GBP / USD_TO_IND;
    private static final double IND_TO_JPY = USD_TO_JPY / USD_TO_IND;
    private static final double IND_TO_CHF = USD_TO_CHF / USD_TO_IND;
    private static final double IND_TO_CAN = USD_TO_CAN / USD_TO_IND;
    private static final double IND_TO_AUS = USD_TO_AUS / USD_TO_IND;
    private static final double IND_TO_CHA = USD_TO_CHA / USD_TO_IND;
    private static final double IND_TO_BRA = USD_TO_BRA / USD_TO_IND;

    // Swiss Franc
    private static final double CHF_TO_USD = 1 / USD_TO_CHF;
    private static final double CHF_TO_EUR = USD_TO_EUR / USD_TO_CHF;
    private static final double CHF_TO_GBP = USD_TO_GBP / USD_TO_CHF;
    private static final double CHF_TO_JPY = USD_TO_JPY / USD_TO_CHF;
    private static final double CHF_TO_IND = USD_TO_IND / USD_TO_CHF;
    private static final double CHF_TO_CAN = USD_TO_CAN / USD_TO_CHF;
    private static final double CHF_TO_AUS = USD_TO_AUS / USD_TO_CHF;
    private static final double CHF_TO_CHA = USD_TO_CHA / USD_TO_CHF;
    private static final double CHF_TO_BRA = USD_TO_BRA / USD_TO_CHF;

    // Canadian
    private static final double CAN_TO_USD = 1 / USD_TO_CAN;
    private static final double CAN_TO_EUR = USD_TO_EUR / USD_TO_CAN;
    private static final double CAN_TO_GBP = USD_TO_GBP / USD_TO_CAN;
    private static final double CAN_TO_JPY = USD_TO_JPY / USD_TO_CAN;
    private static final double CAN_TO_IND = USD_TO_IND / USD_TO_CAN;
    private static final double CAN_TO_CHF = USD_TO_CHF / USD_TO_CAN;
    private static final double CAN_TO_AUS = USD_TO_AUS / USD_TO_CAN;
    private static final double CAN_TO_CHA = USD_TO_CHA / USD_TO_CAN;
    private static final double CAN_TO_BRA = USD_TO_BRA / USD_TO_CAN;
    // Australian
    private static final double AUS_TO_USD = 1 / USD_TO_CAN;
    private static final double AUS_TO_EUR = USD_TO_EUR / USD_TO_AUS;
    private static final double AUS_TO_GBP = USD_TO_GBP / USD_TO_AUS;
    private static final double AUS_TO_JPY = USD_TO_JPY / USD_TO_AUS;
    private static final double AUS_TO_IND = USD_TO_IND / USD_TO_AUS;
    private static final double AUS_TO_CHF = USD_TO_CHF / USD_TO_AUS;
    private static final double AUS_TO_CAN = USD_TO_CAN / USD_TO_AUS;
    private static final double AUS_TO_CHA = USD_TO_CHA / USD_TO_AUS;
    private static final double AUS_TO_BRA = USD_TO_BRA / USD_TO_AUS;
    // China
    private static final double CHA_TO_USD = 1 / USD_TO_CAN;
    private static final double CHA_TO_EUR = USD_TO_EUR / USD_TO_CHA;
    private static final double CHA_TO_GBP = USD_TO_GBP / USD_TO_CHA;
    private static final double CHA_TO_JPY = USD_TO_JPY / USD_TO_CHA;
    private static final double CHA_TO_IND = USD_TO_IND / USD_TO_CHA;
    private static final double CHA_TO_CHF = USD_TO_CHF / USD_TO_CHA;
    private static final double CHA_TO_CAN = USD_TO_CAN / USD_TO_CHA;
    private static final double CHA_TO_AUS = USD_TO_AUS / USD_TO_CHA;
    private static final double CHA_TO_BRA = USD_TO_BRA / USD_TO_CHA;
    // Brazil
    private static final double BRA_TO_USD = 1 / USD_TO_CAN;
    private static final double BRA_TO_EUR = USD_TO_EUR / USD_TO_BRA;
    private static final double BRA_TO_GBP = USD_TO_GBP / USD_TO_BRA;
    private static final double BRA_TO_JPY = USD_TO_JPY / USD_TO_BRA;
    private static final double BRA_TO_IND = USD_TO_IND / USD_TO_BRA;
    private static final double BRA_TO_CHF = USD_TO_CHF / USD_TO_BRA;
    private static final double BRA_TO_CAN = USD_TO_CAN / USD_TO_BRA;
    private static final double BRA_TO_AUS = USD_TO_AUS / USD_TO_BRA;
    private static final double BRA_TO_CHA = USD_TO_CHA / USD_TO_BRA;





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int amount = sc.nextInt();

        System.out.println("    1. Indian Rupee - Symbol: ₹\n" +
                "    2. United States Dollar - Symbol: $\n" +
                "    3. Euro - Symbol: €\n" +
                "    4. British Pound Sterling - Symbol: £\n" +
                "    5. Japanese Yen - Symbol: ¥\n" +
                "    6. Swiss Franc - Symbol: CHF\n" +
                "    7. Canadian Dollar - Symbol: C$\n" +
                "    8. Australian Dollar - Symbol: A$\n" +
                "    9. Chinese Yuan Renminbi - Symbol: ¥ (often represented as CNY)\n" +
                "   10. Brazilian Real - Symbol: R$\n");
        System.out.println("Choose the currency, that you want to convert? ");
        int sourceCurrency = sc.nextInt();

        System.out.println("    1. Indian Rupee - Symbol: ₹\n" +
                "    2. United States Dollar - Symbol: $\n" +
                "    3. Euro - Symbol: €\n" +
                "    4. British Pound Sterling - Symbol: £\n" +
                "    5. Japanese Yen - Symbol: ¥\n" +
                "    6. Swiss Franc - Symbol: CHF\n" +
                "    7. Canadian Dollar - Symbol: C$\n" +
                "    8. Australian Dollar - Symbol: A$\n" +
                "    9. Chinese Yuan Renminbi - Symbol: ¥ (often represented as CNY)\n" +
                "   10. Brazilian Real - Symbol: R$\n");
        System.out.println("Choose the currency, that you want to convert? ");
        int targetCurrency = sc.nextInt();

        double convertAmount = convertCurrency(amount, sourceCurrency, targetCurrency);
        System.out.printf("Converter amount is: %.2f",convertAmount);
    }

    private static double convertCurrency(int amount, int sourceCurrency, int targetCurrency) {
        if (sourceCurrency == targetCurrency){
            return amount;
        }

        return switch (sourceCurrency) {
            case 1 -> // IND
                    convertForIND(amount, targetCurrency);
            case 2 -> // USD
                    convertForUSD(amount, targetCurrency);
            case 3 -> // EURO
                    convertForEURO(amount, targetCurrency);
            case 4 -> // BRITISH
                    convertForGBP(amount, targetCurrency);
            case 5 -> // JAPAN
                    convertForJPY(amount, targetCurrency);
            case 6 -> convertForCHF(amount, targetCurrency);
            case 7 -> convertForCAN(amount, targetCurrency);
            case 8 -> convertForAUS(amount, targetCurrency);
            case 9 -> convertForCHA(amount, targetCurrency);
            case 10 -> convertForBRA(amount, targetCurrency);
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }

    // india
    private static double convertForIND(int amount, int targetCurrency) {
        return switch (targetCurrency) {
            case 2 -> amount * IND_TO_USD;
            case 3 -> amount * IND_TO_EUR;
            case 4 -> amount * IND_TO_GBP;
            case 5 -> amount * IND_TO_JPY;
            case 6 -> amount * IND_TO_CHF;
            case 7 -> amount * IND_TO_CAN;
            case 8 -> amount * IND_TO_AUS;
            case 9 -> amount * IND_TO_CHA;
            case 10 -> amount * IND_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // US
    private static double convertForUSD(int amount, int targetCurrency) {
        return switch (targetCurrency) {
            case 1 -> amount * USD_TO_IND;
            case 3 -> amount * USD_TO_EUR;
            case 4 -> amount * USD_TO_GBP;
            case 5 -> amount * USD_TO_JPY;
            case 6 -> amount * USD_TO_CHF;
            case 7 -> amount * USD_TO_CAN;
            case 8 -> amount * USD_TO_AUS;
            case 9 -> amount * USD_TO_CHA;
            case 10 -> amount * USD_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // Europe
    private static double convertForEURO(int amount, int targetCurrency) {
        return switch (targetCurrency) {
            case 1 -> amount * EUR_TO_IND;
            case 2 -> amount * EUR_TO_USD;
            case 4 -> amount * EUR_TO_GBP;
            case 5 -> amount * EUR_TO_JPY;
            case 6 -> amount * EUR_TO_CHF;
            case 7 -> amount * EUR_TO_CAN;
            case 8 -> amount * EUR_TO_AUS;
            case 9 -> amount * EUR_TO_CHA;
            case 10 -> amount * EUR_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // Britain
    private static double convertForGBP(int amount, int targetCurrency) {
        return switch (targetCurrency){
            case 1 -> amount * GBP_TO_IND;
            case 2 -> amount * GBP_TO_USD;
            case 3 -> amount * GBP_TO_EUR;
            case 5 -> amount * GBP_TO_JPY;
            case 6 -> amount * GBP_TO_CHF;
            case 7 -> amount * GBP_TO_CAN;
            case 8 -> amount * GBP_TO_AUS;
            case 9 -> amount * GBP_TO_CHA;
            case 10 -> amount * GBP_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // Japan
    private static double convertForJPY(int amount, int targetCurrency) {
        return switch (targetCurrency) {
            case 1 -> amount * JPY_TO_IND;
            case 2 -> amount * JPY_TO_USD;
            case 3 -> amount * JPY_TO_EUR;
            case 4 -> amount * JPY_TO_GBP;
            case 6 -> amount * JPY_TO_CHF;
            case 7 -> amount * JPY_TO_CAN;
            case 8 -> amount * JPY_TO_AUS;
            case 9 -> amount * JPY_TO_CHA;
            case 10 -> amount * JPY_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // Swiss Franc
    private static double convertForCHF(int amount, int targetCurrency) {
        return switch (targetCurrency){
            case 1 -> amount * CHF_TO_IND;
            case 2 -> amount * CHF_TO_USD;
            case 3 -> amount * CHF_TO_EUR;
            case 4 -> amount * CHF_TO_GBP;
            case 5 -> amount * CHF_TO_JPY;
            case 7 -> amount * CHF_TO_CAN;
            case 8 -> amount * CHF_TO_AUS;
            case 9 -> amount * CHF_TO_CHA;
            case 10 -> amount * CHF_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // Canada
    private static double convertForCAN(int amount, int targetCurrency) {
        return switch (targetCurrency){
            case 1 -> amount * CAN_TO_IND;
            case 2 -> amount * CAN_TO_USD;
            case 4 -> amount * CAN_TO_GBP;
            case 3 -> amount * CAN_TO_EUR;
            case 5 -> amount * CAN_TO_JPY;
            case 6 -> amount * CAN_TO_CHF;
            case 8 -> amount * CAN_TO_AUS;
            case 9 -> amount * CAN_TO_CHA;
            case 10 -> amount * CAN_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // Australia
    private static double convertForAUS(int amount, int targetCurrency) {
        return switch (targetCurrency){
            case 1 -> amount * AUS_TO_IND;
            case 2 -> amount * AUS_TO_USD;
            case 4 -> amount * AUS_TO_GBP;
            case 3 -> amount * AUS_TO_EUR;
            case 5 -> amount * AUS_TO_JPY;
            case 6 -> amount * AUS_TO_CHF;
            case 7 -> amount * AUS_TO_CAN;
            case 9 -> amount * AUS_TO_CHA;
            case 10 -> amount * AUS_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // China
    private static double convertForCHA(int amount, int targetCurrency) {
        return switch (targetCurrency){
            case 1 -> amount * CHA_TO_IND;
            case 2 -> amount * CHA_TO_USD;
            case 4 -> amount * CHA_TO_GBP;
            case 3 -> amount * CHA_TO_EUR;
            case 5 -> amount * CHA_TO_JPY;
            case 6 -> amount * CHA_TO_CHF;
            case 7 -> amount * CHA_TO_CAN;
            case 8 -> amount * CHA_TO_AUS;
            case 10 -> amount * CHA_TO_BRA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }
    // Brazil
    private static double convertForBRA(int amount, int targetCurrency) {
        return switch (targetCurrency){
            case 1 -> amount * BRA_TO_IND;
            case 2 -> amount * BRA_TO_USD;
            case 4 -> amount * BRA_TO_GBP;
            case 3 -> amount * BRA_TO_EUR;
            case 5 -> amount * BRA_TO_JPY;
            case 6 -> amount * BRA_TO_CHF;
            case 7 -> amount * BRA_TO_CAN;
            case 8 -> amount * BRA_TO_AUS;
            case 9 -> amount * BRA_TO_CHA;
            default -> throw new IllegalArgumentException("Invalid target currency");
        };
    }

}