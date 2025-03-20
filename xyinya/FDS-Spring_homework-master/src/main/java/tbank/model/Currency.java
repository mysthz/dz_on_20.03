package tbank.model;

public class Currency {
    private String id;
    private String name;
    private String baseCurrency;
    private String priceChangeRange;
    private String description;

    public Currency(String id, String name, String baseCurrency, String priceChangeRange, String description) {
        this.id = id;
        this.name = name;
        this.baseCurrency = baseCurrency;
        this.priceChangeRange = priceChangeRange;
        this.description = description;
    }

    public String getId() {
        return id;
    }

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
