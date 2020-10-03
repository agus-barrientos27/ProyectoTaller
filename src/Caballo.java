
public class Caballo extends Carta {

	@Override
	public int getNumero() {
		return Carta.numero[1];
	}

	public static void main(String[] args) {

		Rey n = new Rey();
		Caballo c = new Caballo();

		System.out.println("El numero del rey es: " + n.getNumero());
		System.out.println("El numero del caballo es: " + c.getNumero());

	}

}
