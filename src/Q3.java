import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");




        if(frutas.contains("banana")){
            System.out.println("A lista contém banana que se encontra no index: " + frutas.indexOf("banana"));
        }else{
            System.out.println("A lista não contém banana");
        }
    }
}
