package br.mendonca.trabalho14.sorts;

import br.mendonca.trabalho14.*;
import br.mendonca.trabalho14.tads.*;

public class GabrielFerreiraDaSilvaSort implements ISort{

	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public void merger(ITrabalho14 lista, int inicio, int fim) {
		if(inicio < fim){
            
            int meio = (inicio + fim) / 2;
            
            merger(lista, inicio, meio);
            
            merger(lista, meio + 1, fim);
            
            mergeAux(lista, inicio, meio, fim);
            
        }
	}
	
	private void mergeAux(ITrabalho14 lista, int inicio, int meio, int fim){
        
        boolean fim1 = false;
        boolean fim2 = false;
        int p1 = inicio;
        int p2 = meio + 1;
        
        int tamanho = fim - inicio + 1;
        GabrielFerreiraDaSilvaTAD[] aux = new GabrielFerreiraDaSilvaTAD[tamanho];
        
        for(int i = 0; i < aux.length; i++){
            
            if(!fim1 && !fim2){
                
                if(lista.getItem(p1).getDouble() < lista.getItem(p2).getDouble()){
                    
                    aux[i] = (GabrielFerreiraDaSilvaTAD) lista.getItem(p1++);
                    
                }
                else{
                    
                    aux[i] = (GabrielFerreiraDaSilvaTAD) lista.getItem(p2++);
                    
                }
                
                if(p1 > meio) fim1 = true;
                if(p2 > fim) fim2 = true;
                
            }
            else{
                
                if(!fim1){
                    
                    aux[i] = (GabrielFerreiraDaSilvaTAD) lista.getItem(p1++);
                    
                }
                else{
                    
                    aux[i] = (GabrielFerreiraDaSilvaTAD) lista.getItem(p2++);
                    
                }
                
            }
            
        }
        
        for(int i = 0, j = inicio; i < tamanho; i++, j++){
            lista.setItem(aux[i], j);
        }
        
    }

}
