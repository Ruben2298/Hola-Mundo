package Invertir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertirListas {
	
	public static void main(String[] args) {
		
		List<Integer> Numeros;
		
		Numeros = new ArrayList<Integer>();
		
		Numeros.add(1);
		Numeros.add(50);
		Numeros.add(-15);
		
		for(int i=0;i<Numeros.size() ;i++ ) {
			int lista = (int)(Math.random() * Numeros.size());
			System.out.println(Numeros.get(lista));
		}
		Invertir(); 
	}
	public static void Invertir() {
		List<Integer> Numeros;
		
		Numeros = new ArrayList<Integer>();
		
		Numeros.add(1);
		Numeros.add(50);
		Numeros.add(-15);
		
		for(int i=0;i<Numeros.size() ;i++ ) {
			Collections.reverse(Numeros);
			System.out.println(Numeros.get(i));
		}
	}

}
