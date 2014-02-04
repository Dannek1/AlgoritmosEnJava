/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static String salida(String x){

		System.out.println(x);
		return x;
}

   public static void main(String[] args) {
   		int numeroActual =Integer.parseInt(args[0]);
		int num=0;
   		
	while(num<=numeroActual){
	if(num % 3==0 && num % 5==0){
		
		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
   		salida("FlipFlop");
	
	}else if(num % 3==0){

   		// si el numero es divisible dentro de 3 imprima "Flip"

		salida("Flip");

			System.out.println("Flip");

   		// si el numero es divisible dentro de 5 imprima "Flop"
			System.out.println("Flop");


	} else if(num % 5==0){
		
		// si el numero es divisible dentro de 4 imprima "Flop"
   		salida("Flop");

	} else{
   		
		// de lo contrario, imprima el numero
	      	salida(""+num);
   }
	num++;
}
}

}