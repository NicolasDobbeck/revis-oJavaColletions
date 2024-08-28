

//Criar dois vetores A e B cada um com 10 elementos inteiros.
//Construir um vetor C, onde cada elemento de C é a soma dos
//respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i].

import java.util.Arrays;

public class Questao1 {


    //Terceiro passo: Somar os elementos dos vetores A e B e armazenar no vetor C
    public static void main(String[] args) {
        //Primeiro passo: Criar dois vetores com 10 inteiros cada
        int[] vetorA = {10, 55, 65, 45, 78, 98, 45, 78, 98, 45};
        int[] vetorB = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        //esperado =>  vetorC ={11,56,66,46,79,99,46,79,99,46}

        //Segundo passo: Construir o vetor C com capacidade para 10 inteiros
        int[] vetorC = new int[vetorA.length];

        for (int x = 0; x < vetorA.length; x++) {
//          System.out.println("vetorC[" + x + "] = vetorA[" + x + "] + vetorB[" + x + "];");
            vetorC[x] = vetorA[x] + vetorB[x];
//            System.out.println(vetorC[x]);
        }

        //Bonus: Imprimir o vetor C
        System.out.println(Arrays.toString(vetorC));


    }


}
