/*  
Desarrollar un programaen Java que calcule el cociente entre dos números.
Devolver0(cero)en casode darse una división por cero.
Utilizar un método para hacer la operación 
 
 */
import java.util.Scanner;



 public class Desafio{
    
    public static int calculo(int dividendo,int divisor){
        if(divisor == 0){
            return 0;
        }else{
            return dividendo/divisor;
        }
    }


    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo y el divisor");
        int dividendo = entrada.nextInt();
        int divisor = entrada.nextInt();

        int division = calculo(dividendo,divisor);

        System.out.println("Resultado: " + division);
    }

 }

