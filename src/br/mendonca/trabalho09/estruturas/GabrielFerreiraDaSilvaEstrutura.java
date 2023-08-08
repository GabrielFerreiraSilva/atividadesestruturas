package br.mendonca.trabalho09.estruturas;

import br.mendonca.trabalho09.*;
import br.mendonca.trabalho09.elementos.*;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho09{

	private GabrielFerreiraDaSilvaElemento cursor;
	private int quantidade = 0;
	
	@Override
	public String getAluno() {
		return "Gabriel Ferreira Da Silva";
	}

	@Override
	public int getQuantidade() {
		return this.quantidade;
	}

	@Override
	public Object getLista() {
		return this.cursor;
	}

	@Override
	public void inserirAntes(ITAD tad) {
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento();
		novo.setTad(tad);
		
		if(cursor == null) {
			cursor = novo;
			cursor.setNext(novo);
			cursor.setPrevious(novo);
		}
		else {
			novo.setNext(cursor);
			novo.setPrevious(cursor.getPrevious());
			GabrielFerreiraDaSilvaElemento anterior = (GabrielFerreiraDaSilvaElemento) cursor.getPrevious();
			anterior.setNext(novo);
			cursor.setPrevious(novo);
		}
		quantidade++;
	}

	@Override
	public void inserirDepois(ITAD tad) {
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento();
		novo.setTad(tad);
		
		if(cursor == null) {
			cursor = novo;
			cursor.setNext(novo);
			cursor.setPrevious(novo);
		}
		else {
			novo.setNext(cursor.getNext());
			novo.setPrevious(cursor);
			GabrielFerreiraDaSilvaElemento proximo = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
			proximo.setPrevious(novo);
			cursor.setNext(novo);
		}
		quantidade++;
	}

	@Override
	public void deslocarCursor(int posicao) {
		while(posicao != 0) {
			if(posicao > 0) {
				cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
				posicao--;
			}
			else {
				cursor = (GabrielFerreiraDaSilvaElemento) cursor.getPrevious();
				posicao++;
			}
		}
	}

	@Override
	public ITAD removerAntes() {
		if(quantidade > 0) {
			GabrielFerreiraDaSilvaElemento retorno = (GabrielFerreiraDaSilvaElemento) cursor.getPrevious();
			(retorno.getPrevious()).setNext(cursor);
			cursor.setPrevious(retorno.getPrevious());
			quantidade--;
			return retorno.getTad();
		}
		else {
			return null;
		}
	}

	@Override
	public ITAD removerDepois() {
		if(quantidade > 0) {
			GabrielFerreiraDaSilvaElemento retorno = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
			cursor.setNext(retorno.getNext());
			(cursor.getNext()).setPrevious(cursor);
			quantidade--;
			return retorno.getTad();
		}
		else {
			return null;
		}
	}

	@Override
	public ITAD getAtual() {
		if(cursor == null) {
			return null;
		}
		else {
			return cursor.getTad();
		}	
	}

	@Override
	public ITAD get(int posicao) {
		if(quantidade > 0) {
			posicao = (posicao % quantidade + quantidade) % quantidade;
			
			GabrielFerreiraDaSilvaElemento cursor2 = cursor;
			
			for(int i = 0; i < posicao; i++) {
				cursor2 = (GabrielFerreiraDaSilvaElemento) cursor2.getNext();
				if(cursor2 == cursor) {
					return null;
				}
			}
			
			return cursor2.getTad();
		}
		else {
			return null;
		}
	}

	@Override
	public String print() {
		String msg = "\nLista Sequencial Dinamica Circular Duplamente Encadeada\n";
		if(cursor != null) {
			GabrielFerreiraDaSilvaElemento inicio = cursor;
			do {
				msg += "\n" + inicio.getTad().print();
				inicio = (GabrielFerreiraDaSilvaElemento) inicio.getNext();
			}
			while(inicio != cursor);
		}
		return msg;
	}

}
