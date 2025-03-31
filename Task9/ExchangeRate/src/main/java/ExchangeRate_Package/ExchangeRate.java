package ExchangeRate_Package;

public class ExchangeRate {

    public double getExchangeRate(String oldCurrency, String newCurrency){
        if (oldCurrency.equals("USD") && newCurrency.equals("UGX")){
            return 3630;
        } else if (oldCurrency.equals("NARIA") && newCurrency.equals("DOLLAR")) {
            return 1539.42;
            
        } else if (oldCurrency.equals("POUND") && newCurrency.equals("EURO")) {
            return  1.20;
            
        } else if (oldCurrency.equals("UGX") && newCurrency.equals("POUND")) {
            return 0.00021;
        } else if (oldCurrency.equals("CAD") && newCurrency.equals("UGX")) {
            return 2559.09000;
        }
        else {
            throw new IllegalArgumentException("Invalid Currency Code: " + oldCurrency + "to"+ newCurrency);
        }

    }

    public void setExchangeRate(String pound, String euro, double v) {

    }
}
