/*
==============================================================
|       Curso de Java - Operador Condicional Ternário         |
==============================================================
| Descrição: O operador condicional ternário é uma forma     |
|            concisa de expressar uma estrutura condicional   |
|            em uma única linha. Ele é composto por três     |
|            partes: a condição a ser avaliada, o valor a    |
|            ser retornado caso a condição seja verdadeira    |
|            e o valor a ser retornado caso a condição seja  |
|            falsa.                                           |
--------------------------------------------------------------
| Exemplo: Suponha que temos uma variável 'idade' e queremos |
|          atribuir a string 'maior de idade' se a idade for  |
|          maior ou igual a 18, e 'menor de idade' caso      |
|          contrário. Podemos usar o operador ternário       |
|          da seguinte forma:                                |
|                                                              |
|          String status = (idade >= 18) ? "maior de idade" : |
|                                     "menor de idade";       |
|                                                              |
|          Neste caso, se 'idade' for maior ou igual a 18,    |
|          a variável 'status' será atribuída como            |
|          "maior de idade", caso contrário, será atribuída   |
|          como "menor de idade".   
                           |
==============================================================
--------------------------------------------------------------
| Autor: [DIEGO DOS SANTOS GONÇALVES]
| Data: [Data de criação ou última modificação]
==============================================================

*/
public class OperadoresTernarios {

    public static void main(String[] args) {
        int a = 5; // Assign a value to the variable a
        String b;
        b = (a == 5) ? "a é igual a 5" : "a é diferente de 5";
        System.out.println("Resultado: " + b);

        a = 12; // Change the value of a to 12
        b = (a == 12) ? "a é igual a 12" : "a é diferente de 12";
        System.out.println("Resultado: " + b);


        // outro exemplo
        int d = 13;
        String e;
        e = (d > 14) ? " Atrasado" : (d < 14) ? " Adiantado" : " No Horário";
        System.out.println("Resultado :" + e);


    }
}