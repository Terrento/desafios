package org.example.medios;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
import java.util.Locale;

public class TrianguloLados {

    public ArrayList<Double> gerarLista(double numero1){
        ArrayList<Double> lista = new ArrayList<>();

        double numero2 = numero1*2;
        double numero3 = numero1*Math.sqrt(3);

        DecimalFormat df = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));
        df.setRoundingMode(RoundingMode.CEILING);
        String temp = df.format(numero3);

        numero3 = Double.parseDouble(temp);

        Collections.addAll(lista, numero2, numero3);
        return lista;
    }

}
