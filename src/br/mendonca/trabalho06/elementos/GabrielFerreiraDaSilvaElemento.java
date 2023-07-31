package br.mendonca.trabalho06.elementos;

import br.mendonca.trabalho06.tads.GabrielFerreiraDaSilvaTAD;

public class GabrielFerreiraDaSilvaElemento {

	private GabrielFerreiraDaSilvaTAD tad;
	
	private GabrielFerreiraDaSilvaElemento next;
	
	public GabrielFerreiraDaSilvaElemento(GabrielFerreiraDaSilvaTAD tad) {
		
		this.tad = tad;
		
	}
	
	public GabrielFerreiraDaSilvaTAD getTad() {
		
		return this.tad;
		
	}
	public void setTad(GabrielFerreiraDaSilvaTAD tad) {
		
		this.tad = tad;
		
	}
	
	public GabrielFerreiraDaSilvaElemento getNext() {
		
		return this.next;
		
	}
	public void setNext(GabrielFerreiraDaSilvaElemento next) {
		
		this.next = next;
		
	}
	
}