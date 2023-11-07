package Heranca;

public class Circulo extends Forma{
    
    double raio;

    public Circulo (double raio){

        this.raio=raio;
        calcArea();

    }

    private void calcArea(){

        area = Math.PI*raio*raio;

    }

}
