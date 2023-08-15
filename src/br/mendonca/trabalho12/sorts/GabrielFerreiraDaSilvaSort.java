package br.mendonca.trabalho12.sorts;

import br.mendonca.trabalho12.*;

public class GabrielFerreiraDaSilvaSort implements ISort{

	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public void insert(ITrabalho12 lista) {
		for(int i = 0; i < lista.getQuantidade(); i++) {
			for(int j = i; j > 0; j--) {
				if(lista.getItem(j).getDouble() < lista.getItem(j - 1).getDouble()) {
					ITAD auxiliar = lista.getItem(j - 1);
					lista.setItem(lista.getItem(j), j - 1);
					lista.setItem(auxiliar, j);
				}
			}
		}
	}

}
