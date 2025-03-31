package ExchangeRate_Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExchangeRateTest {
    private ExchangeRate exchangeRate;
    private covension convension;

    @BeforeEach
    void setUp() {
        exchangeRate = new ExchangeRate();
    }

    @Test
    void testGetExchangeRate_PoundToEuro() {
        double expectedRate = 1.20;
        double actualRate = exchangeRate.getExchangeRate("POUND", "EURO");
        assertEquals(expectedRate, actualRate, 0.001, "POUND to EURO conversion rate should be 1.20");
    }

    @Test
    void testGetExchangeRate_UsdToUgx() {
        assertEquals(3630, exchangeRate.getExchangeRate("USD", "UGX"),
                "USD to UGX conversion rate should be 3630");
    }

    @Test
    void testGetExchangeRate_NariaToDollar() {
        assertEquals(1539.42, exchangeRate.getExchangeRate("NARIA", "DOLLAR"), 0.001,
                "NARIA to DOLLAR conversion is correct");
    }

    @Test
    void testGetExchangeRate_InvalidCurrency() {
       assertEquals(1.20,exchangeRate.getExchangeRate("POUND","BIT COINE"));
    }
}
