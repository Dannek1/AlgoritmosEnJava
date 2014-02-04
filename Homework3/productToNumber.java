/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static String salida(String x){

		System.out.println(x);
		return x;
}

   public static void main(String[] args) {
   		long resultado = 1;
		String cadena="";
   		int x=Integer.parseInt(args[0]);
		
		for(int i=1;i<=x;i++)
		{

		//operando numeros
		resultado=resultado*i;
		
		if (i==1){
		//cadena de mensaje para valor 1
		cadena=cadena+i;

		}else {
		//cadena de mensaje para valor final
		cadena=cadena+"x"+i;
	}
   		
      
   
}	salida("La operacion fue\n"+ cadena + "\nel producto es:"+ resultado);

}		
}