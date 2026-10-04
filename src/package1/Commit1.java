package package1;

import java.util.ArrayList;
import java.util.List;

public class Commit1 {
	
	/** esto debería darle la vuelta a una lista
	 * 
	 * @param a
	 * @return
	 */
	public static List<Integer> daleLaVuelta(List<Integer> a){
		List<Integer> ledilavuelta = new ArrayList<>();
		for(int i= a.size()-1; i>=0; i--) {
			ledilavuelta.add(a.get(i));
		}
		return ledilavuelta;
	}
	
	
// comentariossssss
	public static void main(String[] args) {
		String name = "Alejandro";
				
		System.out.println("Mi nombre es " + name);
		System.out.printf("El estudiante %s está aprendiendo Java", name);
		
	}
}
