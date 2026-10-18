package package1;

import java.util.ArrayList;
import java.util.List;

public class Commit1 {
	
	/** esto debería darle la vuelta a una lista
	 * y comprobar si son iguales la lista original y la lista dada la vuelta.
	 * Además ahora pasa la lista a un string y lo pone en minúsculas
	 * 
	 * @param a
	 * @return
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
	
	
// comentariossssss
	public static void main(String[] args) {
		String name = "Alejandro";
				
		System.out.println("Mi nombre es " + name);
		System.out.printf("El estudiante %s está aprendiendo Java", name);
		
	}
}
