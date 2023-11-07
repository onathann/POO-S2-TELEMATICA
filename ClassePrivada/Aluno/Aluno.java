package Aluno;

public class Aluno {

    private int idade;
    private String nome;

    //construtores

    public Aluno(int idade, String nome){

        this.idade=idade;
        this.nome=nome;

    }

    // metodos para passar os valores
    public int passarIdade(){

        return idade;

    }

    public String passarNome(){

        return nome;

    }

    //definindo os valores

    public void definirValores(int novaidade, String novonome){

        this.idade=novaidade;
        this.nome=novonome;

    }

    public static void main(String[] args) {


        //instaciando o objeto
        Aluno dados = new Aluno(20, "Maria");

        int idadeAtual = dados.passarIdade();
        String nomeAtual = dados.passarNome();

        System.out.printf(idadeAtual + " " + nomeAtual);



    

        
    }




    
}
