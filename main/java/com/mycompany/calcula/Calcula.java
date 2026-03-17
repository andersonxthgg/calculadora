package com.mycompany.calcula;

/**
 * @author Aluno CA
 */
public class Calcula {
    int a;
    int b;
    int total;

    public void soma(int v1, int v2) {
        a = v1;
        b = v2;
        total = a + b;
    }

    public void subtracao(int v1, int v2) {
        a = v1;
        b = v2;
        total = a - b;
    }

    
    public void multiplicacao(int v1, int v2) {
        a = v1;
        b = v2;
        total = a * v2;
    }

    public void mostrarValor() {
        System.out.println("O resultado da operação é: " + total);
    }

    public static void main(String[] args) {
        Calcula calc = new Calcula();

        calc.soma(10, 5);
        calc.mostrarValor();

        calc.subtracao(10, 5);
        calc.mostrarValor();

        calc.multiplicacao(10, 5);
        calc.mostrarValor();
    }
}