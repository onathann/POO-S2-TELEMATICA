public class Pessoa {

    private int idade;
    private String nome;

    //metodoconstrutor
    public Pessoa (int idade, String nome){ 
        this.nome=nome;
        this.idade=idade;
    }

    //metedo de exibição
    public void exibirdados(){
        System.out.println(nome);
        System.out.println(idade);
    }

    public static void main (String args[]){
        //instancia de pessoa
        Pessoa p1 = new Pessoa(12, "Maria");
        //chamando metodo
        p1.exibirdados();
        



    }
    
}
