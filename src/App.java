import java.util.Arrays;

import AlgoritmosOrdenacao.BubbleSort;

public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = {5, 3, 8, 2};

        System.out.println(Arrays.toString(vetor));
        BubbleSort.algoritmo(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
