import java.util.Arrays;

public class ArrayDeInteiros {

    //Segundo passo: Criação de atributos => int[]
    private int[] arr;

    //Terceiro passo: Criação de construtor - etapa nao obrigatoria pois podemos usar o default
    public ArrayDeInteiros() {
        arr = new int[0];
    }

    //Quarto passo: metodo add insere um novo elemento ao conjunto.
    public void add(int i) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = i;
    }

    //Quinto passo: metodo peek retorna o último elemento inserido ao conjunto, sem remover o item;
    public int peek() {
        return arr[arr.length - 1];
    }

    //Sexto passo: metodo pop remove e retorna a último elemento do inserido ao conjunto;
    public int pop() {
        int i = peek();
        arr = Arrays.copyOf(arr, arr.length - 1);
        return i;
    }

    public int popFirst() {
        int primeiroElemento = arr[0];
        int[] newArr = new int[arr.length - 1];
        for(int i = 0; i < newArr.length; i++) {
          newArr[i]= arr[i + 1];
        }
        arr = newArr;
        return primeiroElemento;
    }

    //resposta aluno
    public int popFirst2(){
        int primeiroElemento = arr[0];
        int[] arraySave = new int[0];
        for (int i = 1; i < arr.length; i++) {
            arraySave = Arrays.copyOf(arraySave, arraySave.length + 1);
            arraySave[arraySave.length - 1] = arr[i];
        }
        arr = Arrays.copyOf(arraySave, arraySave.length);

        return primeiroElemento;
    }

    public int popFirst3(){
        int i = arr[0];
        int[] newArr = new int [arr.length -1];
        System.arraycopy(arr,1, newArr,0, newArr.length);
        arr = newArr;
        return i;
    }

    //Bonus
    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
