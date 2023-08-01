package br.mendonca.trabalho06.estruturas;

import br.mendonca.trabalho06.ITAD;
import br.mendonca.trabalho06.ITrabalho06;
import br.mendonca.trabalho06.elementos.GabrielFerreiraDaSilvaElemento;
import br.mendonca.trabalho06.tads.GabrielFerreiraDaSilvaTAD;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho06{

	private GabrielFerreiraDaSilvaElemento inicio;
	
	private int quantidade;
	
	@Override
	public String getAluno() {
		
		return "Gabriel Ferreira da Silva";
		
	}

	@Override
	public int getQuantidade() {
		
		return this.quantidade;
		
	}

	@Override
	public Object getLista() {
		
		return this.inicio;
		
	}

	@Override
	public void push(ITAD tad) {
		
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento((GabrielFerreiraDaSilvaTAD) tad);
		
		novo.setNext(inicio);
		
		inicio = novo;
		
		quantidade++;
		
	}

	@Override
	public ITAD pop() {
		
		if(inicio != null) {
			
			GabrielFerreiraDaSilvaElemento retorno = inicio;
			
			inicio = inicio.getNext();
			
			// DEVE FICAR NULL? VEJA ISSO NA PILHA DINAMICA TAMBEM
			
			quantidade--;
			
			return retorno.getTad();
			
		}
		else {
			
			return null;
			
		}
		
	}

	@Override
	public ITAD get(int posicao) {
		
		if(posicao >= 0 && posicao < quantidade) {
			
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			
			for(int i = 0; i < posicao; i++) {
				
				cursor = cursor.getNext();
				
			}
			
			return cursor.getTad();
			
		}
		else {
			
			return null;
			
		}
		
	}

	@Override
	public String print() {
		
		String msg = "Pilha Dinamica: ";
		
		if(inicio != null) {
			
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			
			while(cursor != null) {
				
				msg += "\n" + cursor.getTad().print();
				
				cursor = cursor.getNext();
				
			}
			
		}
		
		return msg;
		
	}

}
