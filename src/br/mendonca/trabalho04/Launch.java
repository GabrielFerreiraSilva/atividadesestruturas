package br.mendonca.trabalho04;

import br.mendonca.trabalho04.estruturas.GabrielFerreiraDaSilvaEstrutura;
import br.mendonca.trabalho04.tads.GabrielFerreiraDaSilvaTAD;

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
		
		
		GabrielFerreiraDaSilvaEstrutura fila = new GabrielFerreiraDaSilvaEstrutura();

		System.out.println(fila.print());
		
		fila.enqueue(testeTAD);
		
		System.out.println(fila.print());
		
		fila.enqueue(testeTAD1);
		
		System.out.println(fila.print());
		
		fila.enqueue(testeTAD2);
		
		System.out.println(fila.print());
		
		fila.dequeue();
		
		System.out.println(fila.print());
		
		fila.dequeue();
		
		System.out.println(fila.print());
		
		System.out.println(fila.getQuantidade());
		System.out.println(fila.getAluno());
		
		fila.enqueue(testeTAD);
		
		System.out.println(fila.print());
		
		fila.enqueue(testeTAD1);
		
		System.out.println(fila.print());
		
		fila.enqueue(testeTAD2);
		
		System.out.println(fila.print());
		
		System.out.println(fila.get(2).print());
	}

}
