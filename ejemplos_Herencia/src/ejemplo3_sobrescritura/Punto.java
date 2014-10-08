package ejemplo3_sobrescritura;
/**
 * @author Carlos @csharls basado en ejemplos de Apress Oracle Certified
 *         Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805
 */
public class Punto {
	private int xPos, yPos;
	public Punto (int x, int y){
		xPos=x;
		yPos=y;
	}
	public static void main(String[] args) {
		//pasando un objeto Punto a prntln invoca automaticamente al metodo toString
		System.out.println(new Punto(10,20));
	}
}