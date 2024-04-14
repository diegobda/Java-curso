/*
==============================================================
|       Curso de Java - Operadores de Incremento/Decremento |
==============================================================
| Descrição: Este código Java demonstra o uso dos            |
|            operadores de incremento (++) e decremento (--) |
|            para aumentar ou diminuir o valor de uma        |
|            variável em uma unidade.                        |
--------------------------------------------------------------
| Autor: [DIEGO DOS SANTOS GONÇALVES]
| Data: [Data de criação ou última modificação]
==============================================================
*/

public class OperadoresIncrementoDecremento {

    public static void main(String[] args) {
        int num = 10;
        int result = 0;

        System.out.println("Valor original:" + result);
        result = num++; // Primeiro atribui, depois incrementa
        System.out.println("Valor de num após o incremento: " + num);
        System.out.println("Valor de resulto apos o incremento : " + result);


        num = 10; result = 0;
        num++;
        result = ++num; // Primeiro incrementa, depois de atrribuir
        System.out.println("Valor de num após o incremento: " + num);
        System.out.println("Valor de resulto após o incremento :" + result);
    }
}