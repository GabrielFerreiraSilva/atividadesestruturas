package br.mendonca.trabalho07.estruturas;

import br.mendonca.trabalho07.*;
import br.mendonca.trabalho07.elementos.*;

public class GabrielFerreiraDaSilvaEstrutura implements ITrabalho07{

	private GabrielFerreiraDaSilvaElemento inicio;
    private GabrielFerreiraDaSilvaElemento fim;
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
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento();
        novo.setTad(tad);
       
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            novo.setNext(inicio);
            inicio.setPrevious(novo);
            inicio = novo;
        }
       
        quantidade++;
	}

	@Override
	public void inserirNoFim(ITAD tad) {
		GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento();
        novo.setTad(tad);
       
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            novo.setPrevious(fim);
            fim.setNext(novo);
            fim = novo;
        }
       
        quantidade++;
	}

	@Override
	public void inserirNoMeio(ITAD tad, int posicao) {
		if(posicao >= 0 && posicao < quantidade){
			if(posicao == 0) {
				inserirNoIncio(tad);
			}
			else {
				GabrielFerreiraDaSilvaElemento novo = new GabrielFerreiraDaSilvaElemento();
		        novo.setTad(tad);
	           
		        GabrielFerreiraDaSilvaElemento auxiliar = inicio;
	            int cursor = 0;
	            while(cursor < posicao){
	                auxiliar = (GabrielFerreiraDaSilvaElemento) auxiliar.getNext();
	                cursor++;
	            }
	           
	            novo.setNext(auxiliar);
	            novo.setPrevious(auxiliar.getPrevious());
	           
	            GabrielFerreiraDaSilvaElemento anterior = (GabrielFerreiraDaSilvaElemento) auxiliar.getPrevious();
	            anterior.setNext(novo);
	            auxiliar.setPrevious(novo);
			}
            quantidade++;
        }
	}

	@Override
	public ITAD removerNoInicio() {
		if(quantidade > 0){
			ITAD retorno = inicio.getTad();
            GabrielFerreiraDaSilvaElemento novoInicio = (GabrielFerreiraDaSilvaElemento) inicio.getNext();
            novoInicio.setPrevious(null);
            inicio = novoInicio;
           
            quantidade--;
            return retorno;
        }
		else {
			return null;
		}
	}

	@Override
	public ITAD removerNoFim() {
		if(quantidade > 0){
			ITAD retorno = fim.getTad();
			GabrielFerreiraDaSilvaElemento novoFim = (GabrielFerreiraDaSilvaElemento) fim.getPrevious();
            novoFim.setNext(null);
            fim = novoFim;
           
            quantidade--;
            return retorno;
        }
		else {
			return null;
		}
	}

	@Override
	public ITAD removerNoMeio(int posicao) {
		if(quantidade > 0 && posicao >= 0 && posicao < quantidade){
			if(posicao == 0) {
				return removerNoInicio();
			}
			else if(posicao == quantidade - 1) {
				return removerNoFim();
			}
			else {
				GabrielFerreiraDaSilvaElemento auxiliar = inicio;
	            int cursor = 0;
	            while(cursor < posicao){
	                auxiliar = (GabrielFerreiraDaSilvaElemento) auxiliar.getNext();
	                cursor++;
	            }
	           
	            (auxiliar.getPrevious()).setNext(auxiliar.getNext());
	            (auxiliar.getNext()).setPrevious(auxiliar.getPrevious());
	           
	            quantidade--;
	            return auxiliar.getTad();
			}
        }
		else {
			return null;
		}
	}

	@Override
	public ITAD get(int posicao) {
		if(quantidade > 0 && posicao >= 0 && posicao < quantidade){
			GabrielFerreiraDaSilvaElemento auxiliar = null;
            int doInicio = posicao;
            int doFim = quantidade - posicao;
           
            if(doInicio < doFim){
                auxiliar = inicio;
                int cursor = 0;
                while(cursor < posicao){
                    auxiliar = (GabrielFerreiraDaSilvaElemento) auxiliar.getNext();
                    cursor++;
                }
            }
            else{
                auxiliar = fim;
                int cursor = quantidade - 1;
                while(cursor > posicao){
                    auxiliar = (GabrielFerreiraDaSilvaElemento) auxiliar.getPrevious();
                    cursor--;
                }
            }
           
            return auxiliar.getTad();
        }
        else{
            return null;
        }
	}

	@Override
	public String print() {
		String msg = "Lista Sequencial Duplamente Encadeada: ";
	       
        if(inicio != null){
        	GabrielFerreiraDaSilvaElemento cursor = inicio;
           
            while(cursor != null){
                msg += "\n" + cursor.getTad().print();
               
                cursor = (GabrielFerreiraDaSilvaElemento) cursor.getNext();
            }
        }
        else{
            msg += "\n[null]";
        }
       
        return msg;
    }

}
