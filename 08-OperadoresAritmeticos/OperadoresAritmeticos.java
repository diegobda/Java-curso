/*
==============================================================
|             Curso de Java - Operadores Aritméticos         |
==============================================================
| Descrição: Este código Java demonstra o uso dos            |
|            operadores aritméticos básicos, como adição,    |
|            subtração, multiplicação, divisão e módulo.     |
--------------------------------------------------------------
| Autor: [DIEGO DOS SANTOS]
| Data: [21/03/2023]
==============================================================
*/
import java.util.Scanner;

@SuppressWarnings("unused")
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int d = 9;
        int b = 2;

        System.out.printf("d + b = %d\n", d + b);
        System.out.printf("d - b = %d\n", d - b);
        System.out.printf("d * b = %d\n", d * b);         
        System.out.printf("d / b = %d\n", d / b); // Saída como inteiro
        System.out.printf("d / b = %2.2f\n", (double)d / b); // Saída como número de ponto flutuante com duas casas decimais
        System.out.printf("d %% b = %d\n", d % b);
    }
}
