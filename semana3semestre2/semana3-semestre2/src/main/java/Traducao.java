import java.util.HashMap;

public class Traducao {
    public static void main(String[] args) {
        HashMap<String, String> traducoes = new HashMap<>();

        traducoes.put("Hello", "Olá");
        traducoes.put("World", "Mundo");
        traducoes.put("Cat", "Gato");

        // Acessar o valor associado a uma chave
        String traducao = traducoes.get("Hello");
        System.out.println("Tradução de 'Hello': " + traducao);

        // Verificar se a chave está presente
        if (traducoes.containsKey("World")) {
            System.out.println("A tradução para 'World' está presente.");
        }

        // Remover uma entrada
        traducoes.remove("Cat");

        // Iterar sobre as chaves e valores
        for (String chave : traducoes.keySet()) {
            System.out.println("Palavra: " + chave + ", Tradução: " + traducoes.get(chave));
        }
    }
}
