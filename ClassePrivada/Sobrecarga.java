public class Sobrecarga {

    public int soma(int a, int b){

        return a + b;

    }

    public double soma (double a, double b){

        return a + b;

    }

    public static void main(String[] args) {

        Sobrecarga somaTeste = new Sobrecarga();

        int somaInt = somaTeste.soma(1, 2);
        double somaDouble = somaTeste.soma(1.0, 2.0);

        System.out.println(somaInt);
        System.out.println(somaDouble);

        
    }
    
}
