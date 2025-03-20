package tbank.model;

public class CurrencyRequest {
    private String name;
    private String baseCurrency;
    private String priceChangeRange;
    private String description;

    public String getName() {
        return name;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getPriceChangeRange() {
        return priceChangeRange;
    }

    public String getDescription() {
        return description;
    }
}
