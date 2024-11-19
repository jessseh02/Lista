import java.util.LinkedList;
import java.util.Stack;

public class Q15 {
    public static void main(String[] args) {
        Stack<String> letras = new Stack<>();

        letras.push("A");
        letras.push("B");
        letras.push("C");
        letras.push("D");

        System.out.println("Letras: " + letras);

        String letraDoTopo = letras.peek();
        System.out.println("Letea do topo: " + letraDoTopo);

        String letraRemovida = letras.pop();
        System.out.println("Letra Removida: " + letraRemovida);

        System.out.println("Letras após remoção: " + letras);

        while (!letras.isEmpty()){
            System.out.println("Removendo: " + letras.pop());
        }

        System.out.println("Fila Vazia: " + letras);

    }
}
