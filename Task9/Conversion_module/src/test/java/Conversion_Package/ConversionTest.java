package Conversion_Package;

import ExchangeRate_Package.ExchangeRate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {

    @Test
   public void convertAmount_SameCurrency_ReturnsOriginalAmount() {
        ExchangeRate exchangeRate = new ExchangeRate();
        Conversion conversion = new Conversion(exchangeRate);
        double result = conversion.convertAmount(100.0, "USD", "USD");
        assertEquals(100.0, result, 0.01);
    }

    @Test
    void convertAmount_DifferentCurrency_ReturnsConvertedAmount() {
        ExchangeRate exchangeRate = new ExchangeRate();
        Conversion conversion = new Conversion(exchangeRate);
        double result = conversion.convertAmount(100.0, "USD", "UGX");
        assertEquals(363000.0, result, 0.01);
    }

    @Test
    void formatConversion_ValidInput_ReturnsFormattedString() {
        ExchangeRate exchangeRate = new ExchangeRate();
        Conversion conversion = new Conversion(exchangeRate);
        String result = conversion.formatConversion(100.0, "USD", "UGX", 363000.0);
        assertEquals("100.00 USD = 363000.00 UGX", result);
    }
}
