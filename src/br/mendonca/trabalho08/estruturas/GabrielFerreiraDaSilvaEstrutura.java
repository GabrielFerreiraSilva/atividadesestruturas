package br.mendonca.trabalho08.estruturas;

import br.mendonca.trabalho08.*;
import br.mendonca.trabalho08.elementos.GabrielFerreiraDaSilvaElemento;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho08{

	private GabrielFerreiraDaSilvaElemento inicio;
	private int quantidade = 0;
	
	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public Object getLista() {
		return this.inicio;
	}

	@Override
	public int getQuantidade() {
		return this.quantidade;
	}

	@Override
	public void inserirNoIncio(ITAD tad) {
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento(tad);
		
		if(quantidade == 0) {
			inicio = novo;
			novo.setNext(novo);
		}
		else {
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			while(cursor.getNext() != inicio) {
				cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
			}
			cursor.setNext(novo);
			novo.setNext(inicio);
			inicio = novo;
		}
		quantidade++;
	}

	@Override
	// É igual mesmo??????
	public void inserirNoFim(ITAD tad) {
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento(tad);
		
		if(quantidade == 0) {
			inicio = novo;
			novo.setNext(novo);
		}
		else {
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			while(cursor.getNext() != inicio) {
				cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
			}
			cursor.setNext(novo);
			novo.setNext(inicio);
		}
		quantidade++;
	}

	@Override
	public void inserirNoMeio(ITAD tad, int posicao) {
		// Não faz sentido!!!
		// Vai deixar inserir em posição que não existe
		if(posicao < 1) this.inserirNoIncio(tad);
		if(posicao >= quantidade) this.inserirNoFim(tad);
		
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento(tad);
		GabrielFerreiraDaSilvaElemento cursor = this.inicio;
		GabrielFerreiraDaSilvaElemento anterior = cursor;
		
		for(int i = 0; i < posicao; i++) {
			anterior = cursor;
			cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
		}
		
		novo.setNext(cursor);
		anterior.setNext(novo);
		quantidade++;
	}

	@Override
	public ITAD removerNoInicio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITAD removerNoFim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITAD removerNoMeio(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITAD get(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		String msg = "Lista Encadeada Circular: ";
		
		if(inicio != null) {
			
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			
			do {
				
				msg += "\n" + cursor.getTad().print();
				
				cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
				
			}
			while(cursor != inicio);
			
		}
		else{
            
            msg += "\n[null]";
            
        }
		
		return msg;
	}

}
