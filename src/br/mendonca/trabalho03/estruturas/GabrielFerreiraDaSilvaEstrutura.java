package br.mendonca.trabalho03.estruturas;

import br.mendonca.trabalho03.ITAD;
import br.mendonca.trabalho03.ITrabalho03;
import br.mendonca.trabalho03.tads.GabrielFerreiraDaSilvaTAD;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho03{

	private GabrielFerreiraDaSilvaTAD[] fila;
	
	private int quantidade = 0;
	
	private int inicio = 0;
	
	private int fim = 0;
	
	public GabrielFerreiraDaSilvaEstrutura(int tamanho) {
		
		fila = new GabrielFerreiraDaSilvaTAD[tamanho];
		
	}
	
	@Override
	public String getAluno() {
		
		return "Gabriel Ferreira da Silva";
		
	}

	@Override
	public Object[] getLista() {
		
		return this.fila;
		
	}

	@Override
	public int getQuantidade() {
		
		return this.quantidade;
		
	}

	@Override
	public void enqueue(ITAD tad) {
		
		if(quantidade < fila.length) {
			
			fila[fim] = (GabrielFerreiraDaSilvaTAD) tad;
			
			fim = (++fim) % fila.length;
			
			quantidade += 1;
			
		}
		
	}

	@Override
	public ITAD dequeue() {
		
		if(quantidade > 0) {
			
			GabrielFerreiraDaSilvaTAD retorno = fila[inicio];
			
			fila[inicio] = null;
			
			inicio = (++inicio) % fila.length;
			
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
			
			return fila[posicao];
			
		}
		else {
			
			return null;
			
		}
		
	}

	@Override
	public String print() {

		String msg = "Fila Estatica: ";
		
		for(GabrielFerreiraDaSilvaTAD elemento : fila) {
			
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
