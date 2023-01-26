package br.com.eldorado.handsonsemana1matheuswiener.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.eldorado.handsonsemana1matheuswiener.model.Invoice;

public class InvoiceService {

    File file = new File("C:\\Dev\\Workspace\\hands-on-semana-1-matheus-wiener\\src\\main\\resources\\txt", "nota.txt");

    public static List<Invoice> readInvoiceCSV(String filePath) {
        List<Invoice> invoices = new ArrayList<>();
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";", -1);

                Invoice invoice = new Invoice();
                invoice.setCompany(values[0]);
                invoice.setMonth(Integer.valueOf(values[1]));
                invoice.setYear(Integer.valueOf(values[2]));
                invoice.setValue(Integer.valueOf(values[4]));
                invoice.setIssuingDate(values[4]);
                invoice.setInvoice(values[5]);

                invoices.add(invoice);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        invoices.sort(Comparator.comparing(Invoice::getCompany).thenComparing(Invoice::getYear).thenComparing(Invoice::getMonth));


        System.out.println("Invoice List size: " + invoices.size());
        return invoices;
    }

}