package ejemplo1_herencia;

/**
 * @author Carlos @csharls
 * basado en ejemplos de Apress Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805
 */
public class PruebaNumeros {
	//Toma un arreglo de numeros y los suma.
	public static double suma(Number[]numeros){
		double suma=0.0;
		for(Number numero:numeros){
			suma+=numero.doubleValue();
		}
		return suma;
	}	
	public static void main(String[] args) {
		//Creamos un arreglo de numeros
		Number[] nums= new Number[4];
		//asignamos los numeros de clases derivadas
		nums[0]=new Byte((byte)10);
		nums[1]= new Integer(10);
		nums[2]= new Float(10.0f);
		nums[3]= new Double(10.0f);
		//enviamos el arreglo al metodo suma y mostramos en pantalla
		System.out.println("La suma de los números es: "+suma(nums));
	}
}
