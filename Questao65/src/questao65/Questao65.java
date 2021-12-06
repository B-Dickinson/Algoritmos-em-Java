package questao65;

public class Questao65 {

    public static void main(String[] args) {
           Pessoa p[] = new Pessoa[3];
           Livro l[] = new Livro[2];
           Emprestimo e[] = new Emprestimo[2];
           
           p[0] = new Pessoa("Bruce Dickson","123456","11/10/2000","Rua vila Bom Sucesso 5","00035");
           
           l[0] = new Livro("O Ladrão de raios","Rick Riordan","500",490);
           l[1] = new Livro("A Pedra Filosofal","J.K Rowling","600",690);
           
           e[0] = new Emprestimo(p[0],l[0]);
           
           
           e[0].emprestar(p[0],l[0]);
           System.out.println("");
           e[0].devolver(6);
    
    
    }
}
