package com.invoice.com.invoicetest;

import com.invoice.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        //create invoice object
        Invoice invoice1 = new Invoice("45678", "hammer", 2, 30.00);
        Invoice invoice2 = new Invoice("12345", "nails", 3, 8.00);

        //show data
        System.out.println(invoice1.getPartNumber() + ", " + invoice1.getPartDescription() + ", " + invoice1.getQuantity() + ", " + invoice1.getPricePerItem() + ", " + invoice1.getInvoiceAmount());
        System.out.println(invoice2.getPartNumber() + ", " + invoice2.getPartDescription() + ", " + invoice2.getQuantity() + ", " + invoice2.getPricePerItem() + ", " + invoice2.getInvoiceAmount());

    }
    }
