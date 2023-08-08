package br.mendonca.trabalho09;

import br.mendonca.trabalho09.estruturas.*;
import br.mendonca.trabalho09.tads.*;

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
		
		lista.inserirAntes(testeTAD);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirAntes(testeTAD1);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirDepois(testeTAD2);
		System.out.println(lista.print());
		System.out.println(" ");
		
		lista.inserirDepois(testeTAD3);
		System.out.println(lista.print());
		System.out.println(" ");
		
		System.out.println(lista.get(9).print());
		System.out.println(" ");
		
		System.out.println(lista.getAluno());
		System.out.println(" ");
		
	}

}
