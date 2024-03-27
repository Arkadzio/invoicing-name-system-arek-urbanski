package pl.futurecollars.invoicing.model

import spock.lang.Specification

import java.time.LocalDate

class InvoiceTest extends Specification {

    def "should create invoice with provided data"() {
        given:
        def date = LocalDate.of(2024, 3, 25)
        def buyer = new Company(name: "Buyer Company", taxIdentificationNumber: "1234567890")
        def seller = new Company(name: "Seller Company", taxIdentificationNumber: "0987654321")
        def entries = [
                new InvoiceEntry(description: "Item 1", price: 20, vatValue: 4.0, vatRate: Vat.VAT_8),
                new InvoiceEntry(description: "Item 2", price: 10, vatValue:  2.0, vatRate: Vat.VAT_8)
        ]

        when:
        def invoice = new Invoice(date, buyer, seller, entries)

        then:
        invoice.date == date
        invoice.buyer == buyer
        invoice.seller == seller
        invoice.entries == entries
    }

    def "should create invoice with default constructor"() {
        when:
        def invoice = new Invoice()

        then:
        invoice != null
    }
}
