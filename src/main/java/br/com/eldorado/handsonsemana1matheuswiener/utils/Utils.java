package br.com.eldorado.handsonsemana1matheuswiener.utils;

public class Utils {

    public static Integer readInteger(String value) {
        if(value == null || value == "") {
            value = String.valueOf(0);
        }
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Integer.MIN_VALUE;
    }

    public static Double readDouble(String value) {
        if(value == null || value == "") {
            value = String.valueOf(0);
        }
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Double.MIN_NORMAL;
    }
}
