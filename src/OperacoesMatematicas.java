public class OperacoesMatematicas {
    
    
    //metedos estaticos para realizar as operações
    public static double soma(double a, double b){

        return a+b;
     
    }

    public static double subtracao(double a, double b){

        return a-b;
    }

    public static double mult(double a, double b){

        return a*b;
    }

    public static double div(double a, double b){

        return a/b;
    }

    public static void main (String args[]){

        //CHAMANDO OS METODOS

        //chamando o metodo dentro da classe
        double resultadosoma = OperacoesMatematicas.soma(1, 1);
        System.out.println(resultadosoma);
        
        double resultadosubtracao = OperacoesMatematicas.subtracao(1, 1);
        System.out.println(resultadosubtracao);

        double resultadomult = OperacoesMatematicas.mult(2, 2);
        System.out.println(resultadomult);
        
        double resultadodiv = OperacoesMatematicas.div(2, 2);
        System.out.println(resultadodiv);


    }



}
