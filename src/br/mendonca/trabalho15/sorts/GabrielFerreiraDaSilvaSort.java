package br.mendonca.trabalho15.sorts;

import br.mendonca.trabalho15.*;
import br.mendonca.trabalho15.tads.*;

public class GabrielFerreiraDaSilvaSort implements ISort{

	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public void quick(ITrabalho15 lista, int inicio, int fim) {
		
		if(fim > inicio){
            
            int pivo = particiona(lista, inicio, fim);
            quick(lista, inicio, pivo - 1);
            quick(lista, pivo + 1, fim);
            
        }
		
	}
	
	private int particiona(ITrabalho15 lista, int inicio, int fim) {
        int esq = inicio + 1;
        int dir = fim;
        GabrielFerreiraDaSilvaTAD pivo = (GabrielFerreiraDaSilvaTAD) lista.getItem(inicio);
    
        while (esq <= dir) { 
    
            while (esq <= dir && lista.getItem(esq).getDouble() <= pivo.getDouble()) {
                esq++;
            }
    
            while (lista.getItem(dir).getDouble() > pivo.getDouble()) {
                dir--;
            }
    
            if (esq < dir) {
                GabrielFerreiraDaSilvaTAD aux = (GabrielFerreiraDaSilvaTAD) lista.getItem(esq);
                lista.setItem(lista.getItem(dir), esq);
                lista.setItem(aux, dir);;
            }
        }
    
        
        lista.setItem(lista.getItem(dir), inicio);;
        lista.setItem(pivo, dir);;
    
        return dir;
    }
}
