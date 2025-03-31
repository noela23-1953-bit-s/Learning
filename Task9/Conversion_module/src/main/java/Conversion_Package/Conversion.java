package Conversion_Package;

import ExchangeRate_Package.ExchangeRate;

public class Conversion {
    private final ExchangeRate exchangeRate;

    public Conversion(ExchangeRate exchangeRate) {

        this.exchangeRate = exchangeRate;
    }
    public double convertAmount(double Amount, String oldCurrency, String newCurrency){
        if (oldCurrency.equals(newCurrency)){
            return Amount;
        }
        double rate=exchangeRate.getExchangeRate(oldCurrency,newCurrency);
        return  Amount*rate;

    }
    public String formatConversion(double amount, String oldCurrency,
                                   String newCurrency, double convertedAmount) {
        return String.format("%.2f %s = %.2f %s",
                amount, oldCurrency,
                convertedAmount, newCurrency);
    }
}
