package br.mendonca.trabalho05.estruturas;

import br.mendonca.trabalho05.ITAD;
import br.mendonca.trabalho05.ITrabalho05;
import br.mendonca.trabalho05.tads.GabrielFerreiraDaSilvaTAD;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho05{
	
	private GabrielFerreiraDaSilvaTAD[] pilha;
	
	private int quantidade = 0;
	
	public GabrielFerreiraDaSilvaEstrutura(int tamanho) {
		
		pilha = new GabrielFerreiraDaSilvaTAD[tamanho];
		
	}
	
	@Override
	public String getAluno() {
		
		return "Gabriel Ferreira da Silva";
		
	}

	@Override
	public Object[] getLista() {
		
		return this.pilha;
		
	}

	@Override
	public int getQuantidade() {
		
		return this.quantidade;
		
	}

	@Override
	public void push(ITAD tad) {
		
		if(quantidade < pilha.length) {
			
			pilha[quantidade] = (GabrielFerreiraDaSilvaTAD) tad;
			
			quantidade++;
			
		}
		
	}

	@Override
	public ITAD pop() {
		
		if(quantidade > 0) {
			
			GabrielFerreiraDaSilvaTAD retorno = pilha[quantidade - 1];
			
			pilha[quantidade - 1] = null;
			
			quantidade--;
			
			return retorno;
			
		}
		else {
			
			return null;
			
		}
		
	}

	@Override
	public ITAD get(int posicao) {
		
		if(posicao >= 0 && posicao < pilha.length) {
			
			return pilha[posicao];
			
		}
		else {
			
			return null;
			
		}
		
	}

	@Override
	public String print() {
		
		String msg = "Pilha Estatica: ";
		
		for(GabrielFerreiraDaSilvaTAD elemento : pilha) {
			
			if(elemento == null) {
				
				msg += "\n[null]";
				
			}
			else {
				
				msg += "\n" + elemento.print();
				
			}
			
		}
		
		return msg;
		
	}

}
