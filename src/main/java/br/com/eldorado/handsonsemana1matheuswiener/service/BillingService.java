package br.com.eldorado.handsonsemana1matheuswiener.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.eldorado.handsonsemana1matheuswiener.model.Billing;
import br.com.eldorado.handsonsemana1matheuswiener.model.Installment;

@Service
public class BillingService {

    File file = new File("C:\\Dev\\Workspace\\hands-on-semana-1-matheus-wiener\\src\\main\\resources\\txt", "faturamento.txt");

    public static List<Billing> readBillingCSV(String filePath) {
        List<Billing> billingList = new ArrayList<>();
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";", -1);

                Billing billing = new Billing();

                billing.setCompany(values[0]);
                billing.setMonth(Integer.valueOf(values[1]));
                billing.setYear(Integer.valueOf(values[2]));
                billing.setFirstInstallment(new Installment(values[3], values[4]));
                billing.setSecondInstallment(new Installment(values[5], values[6]));
                billing.setThirdInstallment(new Installment(values[7], values[8]));
                billing.setTotalValue(
                        billing.getFirstInstallment().getValue() +
                        billing.getSecondInstallment().getValue() +
                        billing.getThirdInstallment().getValue());

                billingList.add(billing);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        billingList.sort(Comparator.comparing(Billing::getCompany).thenComparing(Billing::getYear).thenComparing(Billing::getMonth));

        System.out.println("Billing List size: " + billingList.size());
        return billingList;
    }

}