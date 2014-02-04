/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
   		int vf=Integer.parseInt(args[0]);
		int x=1;
		
   		//si valor actual < args[0]
   		if(0<vf){
		while(x<=(vf-1)){

		salida("el valor actual es "+x);
		x++;
	}
	}else{salida("el valor dado fue 0");
}
		
      
   }

   public static String salida(String x){

		System.out.println(x);
		return x;
}

}