import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonnaciSequencia {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = leitura.nextInt();
        int a = 0, b = 1;

        while (a < numero) {
            int proximoNumeroDaSequencia = a + b;
            a = b;
            b = proximoNumeroDaSequencia;
        }
        if (a == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonnaci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonnaci.");
        }
    }
}
