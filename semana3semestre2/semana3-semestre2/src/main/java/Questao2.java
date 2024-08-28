
//Construa uma classe capaz de armazenar um array de inteiros.
// A classe deve possuir os seguinte métodos:
//    * void add(int i): insere um novo elemento ao conjunto.
//    * int peek(): retorna o último elemento inserido ao conjunto, sem remover o item;
//    * int pop(): remove e retorna a último elemento do inserido ao conjunto;

// Na classe da questão anterior, implemente um método chamado popFirst(),
// ele deve remover e retornar o primeiro elemento do array.
public class Questao2 {

    public static void main(String[] args) {

        ArrayDeInteiros arr = new ArrayDeInteiros();

        arr.print();

        arr.add(20);
        arr.add(45);
        arr.add(33);
        arr.add(98);
        arr.add(75);

        arr.print();

        System.out.println(arr.peek());

        arr.print();

        System.out.println(arr.pop());

        arr.print();

        System.out.println(arr.popFirst());

        arr.print();

        System.out.println(arr.popFirst3());

        arr.print();

    }
}
