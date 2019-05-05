package intervalos;


import java.util.ArrayList;
import java.util.List;


public class Intervalos {
	
	int[] lista = {100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150};	
	List<List<Integer>> listaBD = new ArrayList<List<Integer>>();
	List<Integer> listaUD = new ArrayList<Integer>();
	
	
	
	public List<List<Integer>> verificarIntervalo() {
		
		for (int i = 0; i < lista.length; i++) {
			if(i == lista.length - 1) {
				listaUD.add(lista[i]);
				listaBD.add(listaUD);
			}
			
			else if(i != 0) {
							
				if(listaUD.size() == 0) {
					listaUD.add(lista[i]);
				}
				
				if (lista[i+1] - lista[i] != 1) {
					listaUD.add(lista[i]);
					listaBD.add(listaUD);
					listaUD = new ArrayList<Integer>();
				}
			}
			 else {
				listaUD.add(lista[i]);
			}
			
		}
		
		System.out.println("Os intervalos são: " + listaBD);
		return listaBD;
	}
	
}
	
	

