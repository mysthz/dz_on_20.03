package tbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tbank.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, String> {}
