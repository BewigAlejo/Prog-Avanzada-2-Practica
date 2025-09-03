


public class practico1 {
   
   public static void main(String[] args) {
     
    /*
    
    Punto 1: 

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        float numero1 = entrada.nextFloat();

        System.out.println("Ingresa el segundo numero");
        float numero2 = entrada.nextFloat();

        float suma = numero1 + numero2;
        System.out.println("La suma de los dos numeros es " + suma);

        entrada.close(); 


        
    Punto 2:

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el numero que quiere elevar al cuadrado");
    float numero = entrada.nextFloat();

    float numeroElevado = numero * numero;

    System.out.println("El numero que ingreso era" + numero + "su cuadrado es " + numeroElevado);


    Punto 3:

    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingrese la medida en metros");
    double medidaMetros = entrada.nextFloat();

    System.out.println("Ingrese 1 para transformar en pies o 2 para pulgadas");
    int conversion = entrada.nextInt();

    switch (conversion) {
        case 1:
            double medidaPie = medidaMetros * 3.28084;
            System.out.println(medidaMetros + " metros son " + medidaPie + " pies");
            break;
        case 2: 
            double medidaPulgadas = medidaMetros * 39.3701;
            System.out.println(medidaMetros + "son " + medidaPulgadas + " pulgadas");
            break;
        default:
            break;
    }

    Punto 4:

    Scanner entrada = new Scanner(System.in);
    
    System.out.println(" Ingrese los dos catetos");
    double cateto1 = entrada.nextDouble();
    double cateto2 = entrada.nextDouble();

    double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
    System.out.println("La hipotenusa es " + hipotenusa);
   }
   

   Punto 5: 

   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Ingrese un entero, para sacar su factorial");
   int numero = entrada.nextInt();

   int factorial=1;
   for(int i = 1 ; i <= numero ; i++){
        factorial = factorial * i;
   }

   System.out.println("El factorial de " + numero + " es: " + factorial);
    
    
   Punto 6:

    Scanner entrada = new Scanner(System.in);

    int[] vector = new int[30];
        for(int i = 0; i < 30 ; i++){
            System.out.println("Ingrese un numero para poner en la posicion " + i);
             vector[i] = entrada.nextInt();
        }
    

    for(int i = 1; i < 30 ; i++){
            if (vector[i-1] == 0) {
                System.out.println(vector[i]);
            }
    }


    

    Punto 7:
    int[] A = new int[10];
        
        // condición inicial
        A[0] = 1;

        // fórmula: A[i+1] = i * A[i] + 2
        for (int i = 0; i < 9; i++) {
            A[i + 1] = i * A[i] + 2;
        }

        // imprimir el vector
        System.out.println("Elementos del vector:");
        for (int i = 0; i < 10; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
   


        Punto 8:

    Scanner entrada = new Scanner(System.in);

    int[] vector = new int[30];
        for(int i = 0; i < 30 ; i++){
            System.out.println("Ingrese un numero para poner en la posicion " + i);
             vector[i] = entrada.nextInt();
        }

        int primerMenor = 0;
        for(int i = 0 ; i < 30 ; i++){
            if (vector[i]<0) {
                primerMenor = i;
                break;
            }
        }

        int primerIndice = vector[0];
        int posicionMayor = 0;
        for(int i = 0 ; i < 30 ; i++){
            if (vector[i]>primerIndice) {
                primerIndice = vector[i];
                posicionMayor = i;
            }
        }

        System.out.println("El primer elemento menor que 0 esta en la posicion " + primerMenor + " y el mayor elemento esta en " + posicionMayor + " y es " + primerIndice);
     
        Punto 9:



    int matriz[][] = new int[10][10];

    for(int i = 0 ; i < 10 ; i++){
        for(int j = 0 ; j < 10 ; j++){
            if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
            }
        }
    }
    

    for(int i = 0 ; i < 10 ; i++){
        for(int j = 0 ; j < 10 ; j++){
            if (i == j) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    
    Punto 10:
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][10]; 
        int[] sumas = new int[5];        


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingresa un número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
                sumas[i] += matriz[i][j]; 
            }
        }

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Fila " + i + " → " + sumas[i]);
        }

        */
    }
}