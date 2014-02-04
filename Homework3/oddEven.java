/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

    public static String salida(String x){

		System.out.println(x);
		return x;
}

   public static void main(String[] args) {
      
      	int x =Integer.parseInt(args[0]);
	
	int resultado=x%2;

	switch (resultado){

		// si el numero es par
		case 0: salida("el numero es par");
			break;

		// si el numero es impar
		default: salida("el numero es impar"); 	
			break;

   		}

   }
}