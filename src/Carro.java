public class Carro {
    
    //atributos
    private String modelo;
    private String marca;
    private int ano;

    //metodo construtor(inicia os objetos dentro da classe)
    public Carro (String modelo, String marca, int ano){

       this.modelo=modelo;
       this.marca=marca;
       this.ano=ano;

    }

    //metodo de exibição
    public void exibir(){

        System.out.println(modelo);
        System.out.println(marca);
        System.out.println(ano);
    }
    

    public static void main (String args[]){

        Carro carro1 = new Carro("celta", "chevrolet", 2008);

        carro1.exibir();
    }
}
