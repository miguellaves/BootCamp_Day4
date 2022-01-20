package progFuncionalAct1;

import java.util.List;

public class contadorFuncional {
		
	public static void main(String[] args) {
		int count = 0;
		
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		for(int numero : numbers) {
			if(numero > 10) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
