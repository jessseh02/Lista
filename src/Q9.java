import java.util.HashMap;
import java.util.Map;

public class Q9 {
    public static void main(String[] args) {
        Map<String, Object> mapeador = new HashMap<>();

        mapeador.put("Jesseh", 22);
        mapeador.put("João Henrique", 20);
        mapeador.put("Felipe", 20);

        String chave = "Jesseh";

        Object valor = mapeador.get(chave);

        if (valor != null){
            System.out.printf("A didade de %s é %d", chave, valor);
        }


    }
}