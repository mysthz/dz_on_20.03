package tbank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tbank.model.Currency;
import tbank.model.CurrencyRequest;

import java.util.List;

@RestController
@RequestMapping("/api/currencies")
public class CurrencyController {

    @GetMapping
    public ResponseEntity<List<Currency>> getCurrencies() {
        return ResponseEntity.ok(List.of());
    }

    @PostMapping
    public ResponseEntity<Void> addCurrency(@RequestBody CurrencyRequest request) {
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Currency> getCurrency(@PathVariable String id) {
        return ResponseEntity.ok(new Currency(id, "USD", "RUB", "+10%/-10%", "Example currency"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCurrency(@PathVariable String id, @RequestBody CurrencyRequest request) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurrency(@PathVariable String id) {
        return ResponseEntity.noContent().build();
    }
}


