package ejemplo2_polimorfimo;

/**
 * @author Carlos @csharls basado en ejemplos de Apress Oracle Certified
 *         Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805
 */
public class PruebaForma {
	public static void main(String[]args){
		Forma forma1= new Circulo(10);
		System.out.println(forma1.area());
		Forma forma2=new Cuadro(10);
		System.out.println(forma2.area());
	}
}
