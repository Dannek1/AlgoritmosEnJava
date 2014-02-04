/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static String salida(String x){

		System.out.println(x);
		return x;
}
   public static void main(String[] args) {

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
	
	salida("el limite inferior es "+a+"\n");
	salida("el limite superior es "+b+"\n");
      	
        for(int x=(a+1);x<=(b-1);x++)
	{
	salida(""+x);
}
      
   }

}