import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Q8 {
    public static void main(String[] args) {
        Map<String, Object> mapeador = new HashMap<>();

        mapeador.put("Jesseh", 22);
        mapeador.put("João Henrique", 20);
        mapeador.put("Felipe", 20);

        for(Map.Entry<String, Object> par : mapeador.entrySet()){
            System.out.println(par.getKey() + ", " + par.getValue() + " anos");
        }
    }
}
