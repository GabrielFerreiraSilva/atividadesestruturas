package br.mendonca.trabalho10.buscas;

import br.mendonca.trabalho10.*;

public class GabrielFerreiraDaSilvaBusca implements IBuscas{

	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public ITAD linear(ITrabalho10 lista, ITAD tad) {
		
		for(int i = 0; i < lista.getQuantidade(); i++) {
			if(lista.getItem(i).getDouble() == tad.getDouble()) {
				return lista.getItem(i);
			}
		}
		return null;
		
	}

	@Override
	public ITAD ordenada(ITrabalho10 lista, ITAD tad) {
		
		for(int i = 0; i < lista.getQuantidade(); i++) {
			if(lista.getItem(i).getDouble() == tad.getDouble()) {
				return lista.getItem(i);
			}
			else {
				if(tad.getDouble() < lista.getItem(i).getDouble()) {
					return null;
				}
			}
		}
		return null;
		
	}

	@Override
	public ITAD binaria(ITrabalho10 lista, ITAD tad) {
		
		int inicio = 0;
		int meio = 0;
		int fim = lista.getQuantidade() - 1;
		
		while(inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			if(tad.getDouble() < lista.getItem(meio).getDouble()) {
				fim = meio - 1;
			}
			else {
				if(tad.getDouble() > lista.getItem(meio).getDouble()) {
					inicio = meio + 1;
				}
				else {
					return lista.getItem(meio);
				}
			}
		}
		return null;
		
	}

}
