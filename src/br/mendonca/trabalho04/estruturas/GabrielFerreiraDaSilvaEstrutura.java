package br.mendonca.trabalho04.estruturas;

import br.mendonca.trabalho04.ITAD;
import br.mendonca.trabalho04.ITrabalho04;
import br.mendonca.trabalho04.elementos.GabrielFerreiraDaSilvaElemento;
import br.mendonca.trabalho04.tads.GabrielFerreiraDaSilvaTAD;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho04{

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
		
		return inicio;	
		
	}

	@Override
	public void enqueue(ITAD tad) {
		
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento((GabrielFerreiraDaSilvaTAD) tad);
		
		if(inicio == null) {
			
			inicio = novo;
			
		}
		else {
			
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			
			while(cursor.getNext() != null) {
				
				cursor = cursor.getNext();
				
			}
			
			cursor.setNext(novo);
			
		}
		
		quantidade ++;
		
	}

	@Override
	public ITAD dequeue() {
		
		if(quantidade > 0) {
			
			GabrielFerreiraDaSilvaTAD retorno = inicio.getTad();
			
			this.inicio = inicio.getNext();
			
			quantidade--;
			
			return retorno;
			
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
		
		String msg = "Fila Dinamica: ";
		
		if(inicio != null) {
			
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			
			while(cursor != null) {
				
				msg += "\n" + cursor.getTad().print();
				
				cursor = cursor.getNext();
				
			}
			
		}
		else{

            msg += "\n[null]";

        }
		
		return msg;
		
	}

}
