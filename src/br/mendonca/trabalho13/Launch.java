package br.mendonca.trabalho13;

import br.mendonca.trabalho13.estruturas.*;
import br.mendonca.trabalho13.sorts.*;
import br.mendonca.trabalho13.tads.*;

public class Launch {

	public static void main(String[] args) {
		
		GabrielFerreiraDaSilvaTAD testeTAD = new GabrielFerreiraDaSilvaTAD("X", 1.0, true);		
		GabrielFerreiraDaSilvaTAD testeTAD1 = new GabrielFerreiraDaSilvaTAD("X", 2.0, true);
		GabrielFerreiraDaSilvaTAD testeTAD2 = new GabrielFerreiraDaSilvaTAD("X", 3.0, true);		
		GabrielFerreiraDaSilvaTAD testeTAD3 = new GabrielFerreiraDaSilvaTAD("X", 4.0, true);	
		GabrielFerreiraDaSilvaTAD testeTAD4 = new GabrielFerreiraDaSilvaTAD("X", 5.0, true);
		System.out.println(testeTAD.print());
		System.out.println(" ");
		System.out.println(testeTAD1.print());
		System.out.println(" ");
		System.out.println(testeTAD2.print());
		System.out.println(" ");
		System.out.println(testeTAD3.print());
		System.out.println(" ");
		System.out.println(testeTAD4.print());
		System.out.println(" ");
		
		
		GabrielFerreiraDaSilvaEstrutura lista = new GabrielFerreiraDaSilvaEstrutura(5);
		
		lista.inserirNoFim(testeTAD4);
		lista.inserirNoFim(testeTAD3);
		lista.inserirNoFim(testeTAD2);
		lista.inserirNoFim(testeTAD1);
		lista.inserirNoFim(testeTAD);
		
		GabrielFerreiraDaSilvaSort sort = new GabrielFerreiraDaSilvaSort();
		
		System.out.println(lista.print());
		
		sort.selection(lista);
		
		System.out.println(lista.print());
		
	}

}
