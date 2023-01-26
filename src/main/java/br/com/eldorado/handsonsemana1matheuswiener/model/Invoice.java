package br.com.eldorado.handsonsemana1matheuswiener.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invoice implements Comparable<Invoice> {
    private String company;
    private int month;
    private int year;
    private double value;
    private String issuingDate;
    private String invoice;

    @Override
    public String toString() {
        return "Invoice{" +
                "company='" + company + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", value=" + value +
                ", issuingDate='" + issuingDate + '\'' +
                ", invoice='" + invoice + '\'' +
                '}';
    }

    @Override
    public int compareTo(Invoice o) {
        return 0;
    }
}