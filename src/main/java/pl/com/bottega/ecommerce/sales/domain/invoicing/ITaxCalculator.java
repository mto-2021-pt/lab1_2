package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public interface ITaxCalculator {
    Tax calculate(RequestItem item, Money money);
}
