package tickets;
import java.util.Scanner;

public class Venda_Nicolas_Fiorito {
	public static void main (String[]args) {
		Scanner s= new Scanner(System.in);
		Zona platea= new Zona(1000);
		Zona anfiteatro= new Zona(200);
		Zona VIP = new Zona (25);
	
	while(Zona.isMenu()) {
		System.out.println("Bienvenidx al servicio de venta de entradas, elija una opción:");
		System.out.println("1. Mostrar número de entradas libres.");
		System.out.println("2. Comprar entradas");
		System.out.println("3. Salir");
		Zona.setOpcion(s.nextInt());
		switch (Zona.getOpcion()) {
		case 1:
			System.out.println("El número de entradas es:");
			System.out.println("Zona Platea "+platea.getEntradesPerVendre());
			System.out.println("Zona Anfiteatro "+anfiteatro.getEntradesPerVendre());
			System.out.println("Zona VIP "+VIP.getEntradesPerVendre());
		break;
		case 2:
			System.out.println("¿Qué zona desea?");
			System.out.println("1. Zona Platea");
			System.out.println("2. Zona Anfiteatro");
			System.out.println("3. Zona VIP");
			System.out.println("4. Atrás");
			
			while (Zona.getOpcion()!= 4) {
				Zona.setOpcion(s.nextInt());
			switch (Zona.getOpcion()) {
			case 1:
				System.out.println("¿Cuántas entradas desea comprar?");
				int n = s.nextInt();
				platea.vendre(n);
				System.out.println("Para volver atrás pulse 4");
			break;
			case 2:
				System.out.println("¿Cuántas entradas desea comprar?");
				int m = s.nextInt();
				anfiteatro.vendre(m);
				System.out.println("Para volver atrás pulse 4");
			break;
			case 3:
				System.out.println("¿Cuántas entradas desea comprar?");
				int a = s.nextInt();
				anfiteatro.vendre(a);
				System.out.println("Para volver atrás pulse 4");
			}
			}
		break;
		case 3:
			Zona.setMenu(false);
			System.out.println("¡Gracias, hasta la vista!");
		break;
		default:
			System.out.println("Las opciones disponibles son 1, 2 y 3");
		}
	}
}
}
