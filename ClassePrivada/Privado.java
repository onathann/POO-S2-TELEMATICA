public class Privado {
    
    private String nome;
    private String raca;


    // metodo construtor(inicializa os objetos da classe)
    public Privado (String nome, String raca){

        this.nome=nome;
        this.raca=raca;

    }

    public String passarNome(){

        return nome;

    }

    public String passarRaca(){

        return raca;

    }

    public void definirValores(String novoNome, String novaRaca){

        this.nome = novoNome;
        this.raca = novaRaca;
    
    }

        public static void main(String[] args){


            //instanciando o objeto 
            Privado exemplo = new Privado("Maria", "parda");

            String nomeAtual = exemplo.passarNome();
            String racaAtual = exemplo.passarRaca();

            System.out.println(nomeAtual + " " + racaAtual);

            //mudando valores
            exemplo.definirValores("Gabriel", "Branco");

            nomeAtual=exemplo.passarNome();
            racaAtual=exemplo.passarRaca();


            System.out.println(nomeAtual + " " + racaAtual);






        }
    

}
