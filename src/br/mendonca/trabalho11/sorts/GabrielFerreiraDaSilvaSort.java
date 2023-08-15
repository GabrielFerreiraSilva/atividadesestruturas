package br.mendonca.trabalho11.sorts;

import br.mendonca.trabalho11.*;

public class GabrielFerreiraDaSilvaSort implements ISort{

	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public void bubble(ITrabalho11 lista) {
		int fim = lista.getQuantidade();
		int continua = 0;
		ITAD auxiliar;
		
		do {
			continua = 0;
			for(int i = 1; i < fim; i++) {
				if(lista.getItem(i).getDouble() < lista.getItem(i - 1).getDouble()) {
					auxiliar = lista.getItem(i);
					lista.setItem(lista.getItem(i - 1), i);
					lista.setItem(auxiliar, i - 1);
					continua = i;
				}
			}
		}
		while(continua != 0);		
	}

}
