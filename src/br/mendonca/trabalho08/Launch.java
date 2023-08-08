package br.mendonca.trabalho08;

import br.mendonca.trabalho08.tads.GabrielFerreiraDaSilvaTAD;
import br.mendonca.trabalho08.estruturas.GabrielFerreiraDaSilvaEstrutura;

public class Launch {
	
	public static void main(String[] args) {
	
	GabrielFerreiraDaSilvaTAD testeTAD = new GabrielFerreiraDaSilvaTAD();
	
	GabrielFerreiraDaSilvaTAD testeTAD1 = new GabrielFerreiraDaSilvaTAD();
	
	GabrielFerreiraDaSilvaTAD testeTAD2 = new GabrielFerreiraDaSilvaTAD();
	
	GabrielFerreiraDaSilvaTAD testeTAD3 = new GabrielFerreiraDaSilvaTAD();
	
	GabrielFerreiraDaSilvaTAD testeTAD4 = new GabrielFerreiraDaSilvaTAD();

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
	
	
	GabrielFerreiraDaSilvaEstrutura lista = new GabrielFerreiraDaSilvaEstrutura();
	
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirNoIncio(testeTAD);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirNoFim(testeTAD1);
		System.out.println(lista.print());
		System.out.println(" ");
		
		
		lista.inserirNoMeio(testeTAD3, 0);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirNoMeio(testeTAD4, 2);
		System.out.println(lista.print());
		System.out.println(" ");
		
		System.out.println(lista.get(8).print());
		System.out.println(" ");
	
	
	}
	
	
	
}
