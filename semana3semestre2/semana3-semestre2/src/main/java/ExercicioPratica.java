import java.util.Arrays;

public class ExercicioPratica {
    public static void main(String[] args) {
        int[] vetorA = {10, 55, 65, 45, 78, 98, 45, 78, 98, 45};
        int[] vetorB = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.println(Arrays.toString(vetorC));
    }
}
