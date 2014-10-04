package ejemplo2_polimorfimo;
/**
 * @author Carlos @csharls basado en ejemplos de Apress Oracle Certified
 *         Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805
 */
public class Cuadro extends Forma {
	private int lado;
	public Cuadro(int a) {
		lado = a;
	}
	public double area() {
		return lado * lado;
	}
} 