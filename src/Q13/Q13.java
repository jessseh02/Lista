package Q13;

import java.util.ArrayList;

public class Q13 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
       Pessoa jesseh = new Pessoa("Jesseh", 22);
       Pessoa felipe = new Pessoa("Felpe", 20);
       Pessoa joao = new Pessoa("João", 20);

       pessoas.add(jesseh);
       pessoas.add(felipe);
       pessoas.add(joao);

       for (Pessoa pessoa : pessoas){
           System.out.println("Nome: " + pessoa.getNome() +", idade: " + pessoa.getIdade());

       }

    }
}
