
public class Contador {

    private int primeiroNumero;
    private int segundoNumero;

    public Contador(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public void imprimirNumeros() throws ParametrosInvalidosException {
        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidadeIteracoes = segundoNumero - primeiroNumero + 1;

        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}