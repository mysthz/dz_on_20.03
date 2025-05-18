// src/main/java/tbank/model/CurrencyRequest.java
package tbank.model;

public class CurrencyRequest {
    private String name;
    private String baseCurrency;
    private String priceChangeRange;
    private String description;

    public CurrencyRequest() {}

    public CurrencyRequest(String name, String baseCurrency, String priceChangeRange, String description) {
        this.name = name;
        this.baseCurrency = baseCurrency;
        this.priceChangeRange = priceChangeRange;
        this.description = description;
    }

    // Getters and setters
}
