import java.util.HashSet;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        if(numeros.contains(15)){
            System.out.println("O número 15 está na lista");
        }else{
            System.out.println("O número 15 não está na lista");
        }
    }
}
