package Q11;

import java.util.HashMap;
import java.util.Map;

public class Q11 {
    public static void main(String[] args) {
        Map<String, Pessoa> pessoas = new HashMap<>();

        Pessoa jesseh = new Pessoa("Jesseh", 22);
        Pessoa felipe = new Pessoa("Felipe", 20);
        Pessoa joao = new Pessoa("João", 20);

        pessoas.put(jesseh.getNome(), jesseh);
        pessoas.put(felipe.getNome(), felipe);
        pessoas.put(joao.getNome(), joao);

        for( String nome : pessoas.keySet()) {
            Pessoa pessoa = pessoas.get(nome);
            System.out.println(pessoa);
        }
    }
}
