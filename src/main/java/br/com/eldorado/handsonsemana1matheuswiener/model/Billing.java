package br.com.eldorado.handsonsemana1matheuswiener.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Billing implements Comparable<Billing> {
    
    private String company;
    private int month;
    private int year;
    private Installment firstInstallment;
    private Installment secondInstallment;
    private Installment thirdInstallment;
    private double totalValue;

    @Override
    public String toString() {
        return "Billing{" +
                "company='" + company + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", firstInstallment=" + firstInstallment +
                ", secondInstallment=" + secondInstallment +
                ", thirdInstallment=" + thirdInstallment +
                ", total=" + totalValue +
                '}';
    }

    @Override
    public int compareTo(Billing o) {
        return 0;
    }
}