//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int inserirOrdenadoDecrescente(int[] lista, int tamanho, int novoValor) {
        if (tamanho == lista.length) {
            System.out.println("Lista cheia!");
            return tamanho;
        }

        int i;

        for (i = tamanho - 1; i >= 0 && lista[i] < novoValor; i--) {
            lista[i + 1] = lista[i];
        }

        lista[i + 1] = novoValor;
        return tamanho + 1;
    }

    public static void exibir(int[] lista, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] lista = new int[10];
        int tamanho = 0;

        tamanho = inserirOrdenadoDecrescente(lista, tamanho, 30);
        tamanho = inserirOrdenadoDecrescente(lista, tamanho, 10);
        tamanho = inserirOrdenadoDecrescente(lista, tamanho, 50);
        tamanho = inserirOrdenadoDecrescente(lista, tamanho, 20);
        tamanho = inserirOrdenadoDecrescente(lista, tamanho, 40);

        exibir(lista, tamanho);
    }
}