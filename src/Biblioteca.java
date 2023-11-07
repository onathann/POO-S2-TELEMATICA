import java.util.ArrayList;
import java.util.List;
public class Biblioteca {

    private List<Livros> listaDeLivros;
    
    
    public Biblioteca(){

        listaDeLivros = new ArrayList<>();

    }

    public void addLivros(Livros livro){

        listaDeLivros.add (livro);

    }

    public void removeLivros(Livros livro){

        listaDeLivros.remove(livro);

    }

    public List<Livros> listaDeLivros(){

        return listaDeLivros;
    }
    public static void main (String args[]){

        Biblioteca biblioteca = new Biblioteca();
        Livros livro1 = new Livros("Death Note", 30);
        Livros livro2 = new Livros("A voz do silencio", 40);
        Livros livro3 = new Livros("13 porques", 15);
        biblioteca.addLivros(livro1);
        biblioteca.addLivros(livro2);
        biblioteca.addLivros(livro3);

        
        


        List<Livros> livrosNaBiblioteca = biblioteca.listaDeLivros();
       
         
        System.out.println("livros na biblioteca");
        for(Livros livro: livrosNaBiblioteca){

            System.out.println("Titulo: "+ livro.passarTitulo());
            System.out.println("Preço: "+ livro.passarPreco());
            System.out.println();

        }
       


    }

    
}
