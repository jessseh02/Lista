import java.util.HashSet;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) {
        Set<String> cidades = new HashSet<>();

        cidades.add("Cajazeiras");
        cidades.add("Triunfo");
        cidades.add("Sousa");
        cidades.add("São João");
        cidades.add("Patos");

        for( String cidade: cidades ){
            System.out.println(cidade);
        }
    }
}
