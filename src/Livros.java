public class Livros{
    private String titulo;
    private double preco;

    public Livros(String titulo, double preco){

        this.titulo = titulo;
        this.preco = preco;
        
    }

    public String passarTitulo(){

        return titulo;

    }

    public double passarPreco(){

        return preco; 

    }


    
}
