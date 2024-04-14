import java.util.Scanner;

public class Contantes {
    private static final double LARGURA = 10.0;

        public static void main(String[] args) {
            try (Scanner entrada = new Scanner(System.in)) {
                System.out.println("Entre com o comprimento:");
                double compr = entrada.nextDouble();

                double area = calculaArea(LARGURA, compr);
                System.out.println("A área é:" + area);
            }
            
        }

        private static double calculaArea(double LARGURA, double comprimento) {
            return LARGURA * comprimento;
        }

    }
