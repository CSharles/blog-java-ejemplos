package ejemplo2_polimorfimo;
/**
 * @author Carlos @csharls basado en ejemplos de Apress Oracle Certified
 *         Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805
 */
public class Circulo extends Forma {
	private int radio;
	public Circulo(int r) {
		radio = r;
	}
	public double area() {
		return Math.PI * radio * radio;
	}
}