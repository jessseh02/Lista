import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q10 {
    public static void main(String[] args) {


        TreeMap<String, Object> nomes = new TreeMap<>();

        nomes.put("Jesseh", 22);
        nomes.put("João", 20);
        nomes.put("Felipe", 20);
        nomes.put("Nicolly", 20);
        nomes.put("Miguel", 8);

        for(Map.Entry<String, Object> par : nomes.entrySet()){
            System.out.println(par.getKey() + "," + par.getValue() + " anos");
        }
    }
}
