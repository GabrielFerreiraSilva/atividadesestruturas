package br.mendonca.trabalho07;

import br.mendonca.trabalho07.tads.*;
import br.mendonca.trabalho07.estruturas.*;

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
		
		lista.inserirNoIncio(testeTAD1);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirNoIncio(testeTAD2);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirNoFim(testeTAD3);
		System.out.println(lista.print());
		System.out.println(" ");

		lista.inserirNoFim(testeTAD4);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirNoMeio(testeTAD, 4);
		System.out.println(lista.print());
		System.out.println(" ");
		
		System.out.println(lista.getLista());
		System.out.println(" ");
		
	}

}
