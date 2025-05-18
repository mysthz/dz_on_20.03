package tbank.service;

import org.springframework.stereotype.Service;
import tbank.exception.NotFoundException;
import tbank.model.Currency;
import tbank.model.CurrencyRequest;
import tbank.repository.CurrencyRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CurrencyService {

    private final CurrencyRepository repository;

    public CurrencyService(CurrencyRepository repository) {
        this.repository = repository;
    }

    public List<Currency> findAll() {
        return repository.findAll();
    }

    public Currency findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Currency not found with id: " + id));
    }

    public Currency save(CurrencyRequest request) {
        Currency currency = new Currency(
                UUID.randomUUID().toString(),
                request.getName(),
                request.getBaseCurrency(),
                request.getPriceChangeRange(),
                request.getDescription()
        );
        return repository.save(currency);
    }

    public Currency update(String id, CurrencyRequest request) {
        Currency currency = findById(id);
        currency.setName(request.getName());
        currency.setBaseCurrency(request.getBaseCurrency());
        currency.setPriceChangeRange(request.getPriceChangeRange());
        currency.setDescription(request.getDescription());
        return repository.save(currency);
    }

    public void delete(String id) {
        Currency currency = findById(id);
        repository.delete(currency);
    }
}
