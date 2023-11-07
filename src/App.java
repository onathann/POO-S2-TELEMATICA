import java.util.Scanner;

public class App {
    public static void main (String args[]){
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insira o 1 numero ");
        Double numA = scan.nextDouble();
        System.out.println("insira o 2 numero: ");
        double numB = scan.nextDouble();
        System.out.println("digite o terceiro numero: ");
        double numC = scan.nextDouble();

        double maior;



        if (numA >= numB && numA>=numC){
            maior = numA;
        }

            else if (numB >= numA && numB>=numC){
                maior = numB;
            }

            else{ 
                maior = numC;
            }

            System.out.println("o maior de todos e 4" + maior);

        scan.close();
}
}