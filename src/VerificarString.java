import java.util.Scanner;

public class VerificarString {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String mensagem = leitura.nextLine();
        int contador = 0;

        for (int i = 0; i < mensagem.length(); i++) {
            char caractere = mensagem.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + "vez(es) nesta string.");
        } else {
            System.out.println("A letra 'a' não aparece nesta string.");
        }
    }
}
