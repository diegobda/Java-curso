/**
 * Declaração variaveis
 * 
 * Sintaxe?
 * 
 * tipo identificador [=valor];
 * 
 * Exemplo
 * 
 * byte a;
 * char t
 * int valor;
 * float x, y;
 * int dia = 20;
 * char sexo = 'F';
 */


 public class Variaveis {
    public static void main(String[] args) {
        boolean Vouf = true;
        byte a;
        char letra = 'F';
        int valor = 45205555;
        double x = 3.14;
        a = 20;
        
        System.out.printf("Valor de Vouf(boolean): %b\n", Vouf);
        System.out.printf("Valor de a(byte): %d\n", a);
        System.out.printf("Valor de letra(char): %c\n", letra);
        System.out.printf("Valor de valor(int): %d\n", valor);
        System.out.printf("Valor de x(double): %2.2f\n", x);
    }
}
