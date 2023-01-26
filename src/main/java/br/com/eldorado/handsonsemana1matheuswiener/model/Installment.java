package br.com.eldorado.handsonsemana1matheuswiener.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Installment {

    private String date;
    private double value;

    @Override
    public String toString() {
        return "Installment{" +
                "date='" + date + '\'' +
                ", value=" + value +
                '}';
    }

    public Installment(String date2, String string) {
    }
}