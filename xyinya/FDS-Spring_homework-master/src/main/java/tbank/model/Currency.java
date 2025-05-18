package tbank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Currency {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String baseCurrency;

    @Column(nullable = false)
    private String priceChangeRange;

    private String description;

    public Currency() {}

    public Currency(String id, String name, String baseCurrency, String priceChangeRange, String description) {
        this.id = id;
        this.name = name;
        this.baseCurrency = baseCurrency;
        this.priceChangeRange = priceChangeRange;
        this.description = description;
    }

    // геттеры и сеттеры
}

