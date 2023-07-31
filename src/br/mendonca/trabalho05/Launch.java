package br.mendonca.trabalho05;

import br.mendonca.trabalho05.tads.GabrielFerreiraDaSilvaTAD;
import br.mendonca.trabalho05.estruturas.GabrielFerreiraDaSilvaEstrutura;

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
		
		GabrielFerreiraDaSilvaEstrutura pilha = new GabrielFerreiraDaSilvaEstrutura(10);
		
		System.out.println(pilha.print());
		
		pilha.push(testeTAD);
		
		System.out.println(pilha.print());


		pilha.push(testeTAD1);
		
		System.out.println(pilha.print());
		
		pilha.push(testeTAD2);
		
		System.out.println(pilha.print());
		
		System.out.println(pilha.getQuantidade());
		
		pilha.pop();
		
		System.out.println(pilha.print());
		
		pilha.pop();
		
		System.out.println(pilha.print());
		
		pilha.push(testeTAD);
		
		System.out.println(pilha.print());


		pilha.push(testeTAD1);
		
		System.out.println(pilha.print());
		
		System.out.println(pilha.get(1).print());
		

	}

}
