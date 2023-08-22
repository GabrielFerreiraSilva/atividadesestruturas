package br.mendonca.trabalho13.sorts;

import br.mendonca.trabalho13.*;
import br.mendonca.trabalho13.tads.*;

public class GabrielFerreiraDaSilvaSort implements ISort{

	@Override
	public String getAluno() {
		return "Gabriel Ferreira da Silva";
	}

	@Override
	public void selection(ITrabalho13 lista) {
		
		int menor = 0;
        
        for(int i = 0; i < lista.getQuantidade()- 1; i++){
            
            menor = i;
            
            for(int j = i + 1; j < lista.getQuantidade(); j++){
                
                if(lista.getItem(j).getDouble() < lista.getItem(menor).getDouble()){
                    
                    menor = j;
                    
                }
                
            }
            
            if(i != menor){
                
            	GabrielFerreiraDaSilvaTAD aux = (GabrielFerreiraDaSilvaTAD) lista.getItem(i);
                
                lista.setItem(lista.getItem(menor), i);
                
                lista.setItem(aux, menor);;
                
            }
            
        }

		
	}

}
