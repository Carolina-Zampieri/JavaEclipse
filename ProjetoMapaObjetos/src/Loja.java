import java.util.HashMap;

public class Loja {
	public static void main(String[] args) {
		/* Integer - int
		 * Double - double
		 * Float - float
		 * Character - char
		 */
		HashMap<Integer, Produto> mapa;
		mapa = new HashMap<Integer, Produto>();
		
		mapa.put(1, new Produto(1, "Computador", 1500.0));
		mapa.put(2, new Produto(2, "Mouser", 30.0));
		mapa.put(3, new Produto(3, "Teclado", 70.0));
		mapa.put(4, new Produto(4, "Monitor", 600.0));
		
		int codigoAbuscar = 3;
		
		Produto p = mapa.get(codigoAbuscar);
		if (p != null) {
			System.out.println("Encontrei: " + p);
		}
		else {
			System.out.println("Nao existe");
		}
	}
}
