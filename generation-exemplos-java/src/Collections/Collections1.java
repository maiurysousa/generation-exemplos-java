package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections1 {

	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");
		
		if(nomes.isEmpty()) //tipo booleano. Se vázio 
		{
			System.out.println("Lista vazia..."+nomes);
		}
		else {
			System.out.println("Lista de nomes: "+nomes);
		}
	}

}
