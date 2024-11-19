import java.util.HashMap;

public class Q20 {
    public static void main(String[] args) {
        HashMap<Integer, String> dias = new HashMap<>();

        dias.put(1,"domingo");
        dias.put(2, "segunda");
        dias.put(3, "terça");
        dias.put(4, "quarta");
        dias.put(5, "quinta");

        System.out.println("Dias: " + dias);

        dias.put(3, "Quarta_Feira");

        System.out.println("Dias após modificação: " + dias);

    }
}
