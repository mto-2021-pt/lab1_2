package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory {
    public Invoice createInvoice(Id invoiceID, ClientData clientData) {
        return new Invoice(invoiceID, clientData);
    }
}
