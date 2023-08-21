package org.example.faceis;

public class Calculadora {
    public double operacaoCalc(double num1, char simb, double num2){
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
        return resultado;
    }
}
