import java.util.LinkedHashMap;

public class Q18 {
    public static void main(String[] args) {
        LinkedHashMap<String, Object> pessoas = new LinkedHashMap<>();

        pessoas.put("Jesseh", 22);
        pessoas.put("Felipe", 20);
        pessoas.put("João", 20);
        pessoas.put("Nicolly", 20);
        pessoas.put("Miguel", 8);

        System.out.println("Pessoas: " + pessoas);

        pessoas.remove("João");

        System.out.println("Pessoas após remoção: " + pessoas);
    }
}
