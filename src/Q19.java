import java.util.ArrayList;

public class Q19 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>();

        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);

        ArrayList<Integer> numeros2 = new ArrayList<>();

        numeros2.add(4);
        numeros2.add(5);
        numeros2.add(6);

        numeros1.addAll(numeros2);

        System.out.println("Números unidos: " + numeros1);
    }
}
