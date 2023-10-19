import java.util.Scanner;

public class DesafioControleFluxo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();

        try {
            Contador contador = new Contador(primeiroNumero, segundoNumero);
            contador.imprimirNumeros();
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}