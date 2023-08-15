package br.mendonca.trabalho12.estruturas;

import br.mendonca.trabalho12.*;
import br.mendonca.trabalho12.tads.*;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho12{

	private GabrielFerreiraDaSilvaTAD[] lista;
	private int quantidade = 0;
	
	public GabrielFerreiraDaSilvaEstrutura(int tamanho) {
		
		lista = new GabrielFerreiraDaSilvaTAD[tamanho];
		
	}
	
	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public int getQuantidade() {
		return this.quantidade;
	}

	@Override
	public void inserirNoInicio(ITAD tad) {
		if(quantidade < lista.length) {
			
			for(int i = quantidade; i > 0; i--) {
				
				lista[i] = lista[i - 1];
				
			}
			
			lista[0] = (GabrielFerreiraDaSilvaTAD) tad;
			
			quantidade ++;
		}
	}

	@Override
	public void inserirNoFim(ITAD tad) {
		if(quantidade < lista.length) {
			
			lista[quantidade] = (GabrielFerreiraDaSilvaTAD) tad;
			
			quantidade++;
			
		}	
		
	}

	@Override
	public void inserirNoMeio(ITAD tad, int posicao) {
		if(quantidade < lista.length) {
			
			if(posicao >= 0 && posicao < quantidade + 1) {
				
				for(int i = quantidade; i > posicao; i--) {
					
					lista[i] = lista[i - 1];
					
				}
				
				lista[posicao] = (GabrielFerreiraDaSilvaTAD) tad;
				
				quantidade++;
				
			}
			
		}
		
	}

	@Override
	public void excluirNoFim() {
		if(quantidade > 0) {
			
			lista[quantidade - 1] = null;
			
			quantidade --;
			
		}
		
	}

	@Override
	public void excluirNoInicio() {
		if (quantidade > 0) {
		    for (int i = 1; i < quantidade; i++) {
		        lista[i - 1] = lista[i];
		    }
		    lista[quantidade - 1] = null;
		    quantidade--;
		}
	}

	@Override
	public void excluirNoMeio(int posicao) {
		if (quantidade > 0) {
			
			for(int i = posicao + 1; i < quantidade; i++) {
				
				lista[i - 1] = lista[i];
				
			}	
			
			lista[quantidade - 1] = null;
			
			quantidade --;
			
		}
		
	}

	@Override
	public ITAD getItem(int posicao) {
		return lista[posicao];
	}

	@Override
	public String print() {
		String msg = "Lista Encadeada Estatica: ";
		
		for(GabrielFerreiraDaSilvaTAD tad : lista) {
			
			if(tad != null) {
				
				msg += "\n" + tad.print();
				
			}
			else {
				
				msg += "\n[null]";
				
			}
			
		}
		
		return msg;
	}

	@Override
	public void setItem(ITAD tad, int posicao) {
		// VEJA MELHOR ISSO DEPOIS
		inserirNoMeio(tad, posicao);
	}
	
}
