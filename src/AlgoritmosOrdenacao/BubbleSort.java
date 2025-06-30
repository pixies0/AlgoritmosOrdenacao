package AlgoritmosOrdenacao;

public class BubbleSort {

    private static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void algoritmo(int[] conjunto) {
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < conjunto.length - 1; i++) {
                if(conjunto[i] > conjunto[i+1]){
                    troca(conjunto, i, i + 1);
                    trocou = true;
                }
            }

        } while (trocou);
    }
}