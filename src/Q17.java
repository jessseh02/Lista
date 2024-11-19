import java.util.HashSet;
import java.util.TreeSet;

public class Q17 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros1 = new TreeSet<>();

        numeros1.add(5);
        numeros1.add(2);
        numeros1.add(9);
        numeros1.add(3);
        numeros1.add(7);
        numeros1.add(2);

        System.out.println(numeros1);

        HashSet<Integer> numeros2 = new HashSet<>();

        numeros2.add(5);
        numeros2.add(2);
        numeros2.add(9);
        numeros2.add(3);
        numeros2.add(7);
        numeros2.add(2);

        System.out.println(numeros2);
    }

}

/* TreeSet e HashSet podem evitar a dublicação de elementos,
porem o HashSet não garante a ordem mas o TreeSet sim
 */
