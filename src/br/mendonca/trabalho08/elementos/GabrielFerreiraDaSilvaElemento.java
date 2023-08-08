package br.mendonca.trabalho08.elementos;

import br.mendonca.trabalho08.IElemento;
import br.mendonca.trabalho08.*;

public class GabrielFerreiraDaSilvaElemento implements IElemento{

	private ITAD tad;
	
	private IElemento next;
	
	public GabrielFerreiraDaSilvaElemento(ITAD tad) {
		
		this.tad = tad;
		
	}
	
	public ITAD getTad() {
		
		return this.tad;
		
	}
	public void setTad(ITAD tad) {
		
		this.tad = tad;
		
	}
	
	public IElemento getNext() {
		
		return this.next;
		
	}
	public void setNext(IElemento next) {
		
		this.next = next;
		
	}
	
}