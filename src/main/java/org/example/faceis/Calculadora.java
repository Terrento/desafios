package org.example.faceis;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Calculadora {
    public double operacaoCalc(double num1, char simb, double num2) throws Exception {
        double resultado = 0;
        boolean chec = true;
        switch(simb){
            case '+':
                resultado = num1+num2;
                break;
            case '-':
                resultado = num1-num2;
                break;
            case '*':
                resultado = num1*num2;
                break;
            case '/':
                resultado = num1/num2;
                break;
            default:
                chec = false;
                break;
        }
        if (chec){
            return resultado;
        } else{
            throw new Exception("Símbolo inválido");
        }
    }

    public double operacaoDesconto(double valor, double porcentagem){
        double resultado = valor-(valor*porcentagem/100);

        DecimalFormat df = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));
        df.setRoundingMode(RoundingMode.CEILING);
        String temp = df.format(resultado);

        resultado = Double.parseDouble(temp);

        return resultado;
    }
}
