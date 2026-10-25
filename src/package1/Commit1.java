package package1;

import java.util.ArrayList;
import java.util.List;

public class Commit1 {
	
	/** esto debería darle la vuelta a una lista
	 * y comprobar si son iguales la lista original y la lista dada la vuelta.
	 * Además ahora pasa la lista a un string y lo pone en minúsculas
	 * 
	 * @param Listas
	 * @return Un String
	 */
	public static String daleLaVuelta(List<Integer> a){
		
		List<Integer> ledilavuelta = new ArrayList<>();
		for(int i= a.size()-1; i>=0; i--) {
			ledilavuelta.add(a.get(i));
			}
		if (a.equals(ledilavuelta)) {
			System.out.println("Si esta dada la vuelta");
			}
		
		String stringDeLaLista = ledilavuelta.toString();
		String minusString = stringDeLaLista.toLowerCase();
		
		return minusString;
		}
	/**
	 * coge los números de una lista, los eleva al cuadrado y los añade a otra lista
	 * que termina devolviendo
	 * @param Listas de números
	 * @return Lista de los números al cuadrado
	 */
	public static List<Integer> primos (List<Integer> a) {
		List<Integer> c= new ArrayList<>();
		int b;
		for (int i : a) {
			b = i^2;
			c.add(b);
		}
		return c;
		
	}
	
// comentariossssss
	public static void main(String[] args) {
		String name = "Alejandro";
				
		System.out.println("Mi nombre es " + name);
		System.out.printf("El estudiante %s está aprendiendo Java", name);
		
	}
}
