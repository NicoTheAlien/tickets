package tickets;

public class Zona {
	private int entradesPerVendre;
	private static boolean menu = true;
	private static int opcion;
	public static int getOpcion() {
		return opcion;
	}
	public static void setOpcion(int opcion) {
		Zona.opcion = opcion;
	}
	public static boolean isMenu() {
		return menu;
	}
	public void setMenu(boolean menu) {
		this.menu = menu;
	}
	public Zona(int n) {
		this.entradesPerVendre = n;
	}
	public int getEntradesPerVendre() {
		return entradesPerVendre;
	}
	public void vendre(int n) {
		if (this.entradesPerVendre == 0) {
			System.out.println("Lo sentimos, las entradas para la zona escogida están agotadas.");
			
		}
		else if (this.entradesPerVendre < n){
			System.out.println("Solo quedan "+this.entradesPerVendre+" entradas para esta zona.");
		}
		if (this.entradesPerVendre >= n) {
			entradesPerVendre-=n;
			System.out.println("Aquí tiene sus "+n+" entradas, gracias.");
		}
	}
}