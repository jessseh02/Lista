import java.util.LinkedList;
import java.util.Queue;

public class Q14 {
    public static void main(String[] args) {
        Queue<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Fila: " + numeros);

        int numeroRemovido = numeros.poll();
        System.out.println("Numero removido: " + numeroRemovido);

        System.out.println("Fila após remoção: " + numeros);

        int proximoNumero = numeros.peek();
        System.out.println("Proximo Número: " + proximoNumero);

        while (!numeros.isEmpty()){
            System.out.println("Removendo: " + numeros.poll());
        }

        System.out.println("Fila vazia: " + numeros);


    }
}
