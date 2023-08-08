package br.mendonca.trabalho09.elementos;

import br.mendonca.trabalho09.*;
import br.mendonca.trabalho09.tads.*;

public class GabrielFerreiraDaSilvaElemento implements IElemento{

	private GabrielFerreiraDaSilvaTAD tad;
	private GabrielFerreiraDaSilvaElemento next;
	private GabrielFerreiraDaSilvaElemento previous;
	
	@Override
	public ITAD getTad() {
		return this.tad;
	}

	@Override
	public void setTad(ITAD tad) {
		this.tad = (GabrielFerreiraDaSilvaTAD) tad;
	}

	@Override
	public IElemento getNext() {
		return this.next;
	}

	@Override
	public void setNext(IElemento next) {
		this.next = (GabrielFerreiraDaSilvaElemento) next;
	}

	@Override
	public IElemento getPrevious() {
		return this.previous;
	}

	@Override
	public void setPrevious(IElemento previous) {
		this.previous = (GabrielFerreiraDaSilvaElemento) previous;		
	}

}
