import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(50);
        numeros.add(30);
        numeros.add(40);
        numeros.sort(null);

        for(int i = 0; i < numeros.size(); i++ ){
            System.out.println(numeros.get(i));
        }


    }
}
