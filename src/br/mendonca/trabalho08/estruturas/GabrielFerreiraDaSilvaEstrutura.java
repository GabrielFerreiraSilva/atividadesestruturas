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
		if(posicao >= 0 && posicao < quantidade) {
			GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento(tad);
			
			if (posicao == 0) {
	            if (quantidade == 0) {
	                inicio = novo;
	                novo.setNext(inicio);
	            } else {
	                GabrielFerreiraDaSilvaElemento cursor = inicio;
	                while (cursor.getNext() != inicio) {
	                    cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
	                }
	                novo.setNext(inicio);
	                inicio = novo;
	                cursor.setNext(inicio);
	            }
	        }
			else {
				GabrielFerreiraDaSilvaElemento cursor = inicio;
	            for (int i = 0; i < posicao - 1; i++) {
	                cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
	            }
	            novo.setNext(cursor.getNext());
	            cursor.setNext(novo);
	        }

	        quantidade++;
		}
	}

	@Override
	public ITAD removerNoInicio() {
		GabrielFerreiraDaSilvaElemento retorno = inicio;

        if (inicio.getNext() == inicio) {
            inicio = null;
        } else {
        	GabrielFerreiraDaSilvaElemento cursor = inicio;
            while (cursor.getNext() != inicio) {
                cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
            }
            inicio = (GabrielFerreiraDaSilvaElemento) inicio.getNext();
            cursor.setNext(inicio);
        }

        quantidade--;
        return retorno.getTad();
	}

	@Override
	public ITAD removerNoFim() {
		if(quantidade > 0) {
			GabrielFerreiraDaSilvaElemento retorno = inicio;
			if(quantidade == 1) {
				retorno = inicio;
				inicio = null;
			}
			else {
				GabrielFerreiraDaSilvaElemento cursor = inicio;
				GabrielFerreiraDaSilvaElemento anterior = inicio;
				while(cursor.getNext() != inicio) {
					anterior = cursor;
					cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
				}
				retorno = cursor;
				anterior.setNext(inicio);
			}
			quantidade--;
			return retorno.getTad();
		}
		else {
			return null;
		}
	}

	@Override
	public ITAD removerNoMeio(int posicao) {
		if(quantidade > 0 && posicao >= 0 && posicao < quantidade) {
			GabrielFerreiraDaSilvaElemento retorno = inicio;
	        if (posicao == 0) {
	        	GabrielFerreiraDaSilvaElemento cursor = inicio;
	        	while(cursor.getNext() != inicio) {
	        		cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
	        	}
	        	inicio = (GabrielFerreiraDaSilvaElemento) inicio.getNext();
	        	cursor.setNext(inicio);
	        } else {
	        	GabrielFerreiraDaSilvaElemento cursor = inicio;
	        	GabrielFerreiraDaSilvaElemento anterior = inicio;
	        	
	        	for(int i = 0; i < posicao; i++) {
	        		anterior = cursor;
	        		cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
	        	}

	            retorno = cursor;
	            anterior.setNext(cursor.getNext());
	        }

	        quantidade--;
	        return retorno.getTad();
		}
		else {
			return null;
		}
	}

	@Override
	public ITAD get(int posicao) {
		if(posicao >= 0) {
			int posicaoReal = posicao % quantidade;
			GabrielFerreiraDaSilvaElemento cursor = inicio;
			
			for(int i = 0; i < posicaoReal; i++) {
				cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
			}
			return cursor.getTad();
		}
		else {
			return null;
		}
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
