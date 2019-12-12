package tickets;
import java.util.Scanner;

public class Venda_Nicolas_Fiorito {
	public static void main (String[]args) {
		Scanner s= new Scanner(System.in);
		Zona platea= new Zona(1000);
		Zona anfiteatro= new Zona(200);
		Zona VIP = new Zona (25);
		System.out.println("Bienvenidx al servicio de venta de entradas, elija una opción:");
		System.out.println("1. Mostrar número de entradas libres.");
		System.out.println("2. Comprar entradas");
		System.out.println("3. Salir");
	while(Zona.isMenu()) {

		Zona.setOpcion(s.nextInt());
		switch (Zona.getOpcion()) {
		case 1:
			System.out.println("El número de entradas es:");
			System.out.println("Zona platea "+platea.getEntradesPerVendre());
			System.out.println("Zona anfiteatro "+anfiteatro.getEntradesPerVendre());
			System.out.println("Zona VIP "+VIP.getEntradesPerVendre());
		}
	}
}
}
