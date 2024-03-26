/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package pl.futurecollars.invoicing;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import pl.futurecollars.invoicing.model.Company;
import pl.futurecollars.invoicing.model.Invoice;
import pl.futurecollars.invoicing.model.InvoiceEntry;
import pl.futurecollars.invoicing.model.Vat;

public class App {

//  public String getGreeting() {
//    return "Hello World!";
//  }

  public static void main(String[] args) {
//    System.out.println(new App().getGreeting());

//    Company seller = new Company("123", "example-seller-address", "example-seller");
//    Company buyer = new Company("456", "example-buyer-address", "example-buyer");
//
//    List<InvoiceEntry> products = new LinkedList<>();
//    products.add(new InvoiceEntry("Product 1", BigDecimal.valueOf(123), BigDecimal.valueOf(12), Vat.VAT_8));
//    products.add(new InvoiceEntry("Product 2", BigDecimal.valueOf(123), BigDecimal.valueOf(12), Vat.VAT_8));
//
//    Invoice invoice = new Invoice(LocalDate.now(), buyer, seller, products);
//    System.out.println(invoice.toString());

//
//    try {
//      ObjectMapper objectMapper = new ObjectMapper();
//      objectMapper.registerModule(new JavaTimeModule());
//      objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//      objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//      String invoiceAsJson = objectMapper.writeValueAsString((List.of(invoice)));
//      objectMapper.writeValue(new File("invoice.json"), invoice);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }


//    try {
//      ObjectMapper objectMapper = new ObjectMapper();
//      objectMapper.registerModule(new JavaTimeModule());
//      Invoice invoiceFromFile = objectMapper.readValue(new File("invoice.json"), Invoice.class);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }


//    try {
//      ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
//      objectMapper.findAndRegisterModules();
//      objectMapper.registerModule(new JavaTimeModule());
//      objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//      objectMapper.writeValue(new File("invoice.yml"), invoice);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }


//    try {
//      ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
//      objectMapper.findAndRegisterModules();
//      objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//      Invoice invoiceFromYml = objectMapper.readValue(new File("invoice.yml"), Invoice.class);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//
//
//    }
//
//
//  }
  }
}