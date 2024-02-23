package primeiro_exemplo;
import primeiro_exemplo.modelos.Pessoa;

public class Hello {
    public static void main(String[] args) {
        int cont = 16;
        String nome = "Ana";
        System.out.println("Olá Mundo!!!");

        System.out.println(cont + " : " + nome);

        Pessoa p1 = new Pessoa();

        // p1.nome = "Ana";
        p1.setNome("Ana");
        // p1.idade = 19;
        p1.setIdade(16);

        //System.out.println(p1.nome + " : " + p1.idade);
        System.out.println(p1.getNome() + " : " + p1.getIdade());

        // Pessoa p2 = p1;
        // p2.nome = "Laura";

        // System.out.println(p2.nome);
        // System.out.println(p1.nome);

        // Pessoa p3 = new Pessoa();
        // p3.nome = "Ana Laura";
        // p3.idade = 16;

        // System.out.println(p1.verificarMaioridade());
        // System.out.println(p3.verificarMaioridade());

   }
}