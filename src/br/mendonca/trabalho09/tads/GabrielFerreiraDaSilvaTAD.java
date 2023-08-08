package br.mendonca.trabalho09.tads;

import java.util.Random;

import br.mendonca.trabalho09.*;

public class GabrielFerreiraDaSilvaTAD implements ITAD{

	private String nome;
	
	private double alturaDoTronco;
	
	private boolean estaFlorescendo;
	
	public GabrielFerreiraDaSilvaTAD() {
		
		String[] nomes = {"Carnauba", "Copernicia prunifera", "carandauba", "carnahyba", "carnaubeira"};
		
		Random rand = new Random();
		
		this.nome = nomes[rand.nextInt(5)] + ", " + nomes[rand.nextInt(5)] + ", " + nomes[rand.nextInt(5)] + ".";
		
		this.alturaDoTronco = rand.nextInt(11) + rand.nextDouble();
		
		this.estaFlorescendo = rand.nextBoolean();
		
	}
	
    public String getString() {
    	
    	return this.nome;
    	
    }
    public void setString(String name) {
    	
    	this.nome = name;
    	
    }
    
    public double getDouble() {
    	
    	return this.alturaDoTronco;
    	
    }
    public void setDouble(double value) {
    	
    	this.alturaDoTronco = value;
    	
    }
    
    public boolean isBoolean() {
    	
    	return this.estaFlorescendo;
    	
    }
    public void setBoolean(boolean bit) {
    	
    	this.estaFlorescendo = bit;
    	
    }
    
    public String print() {
    	
    	return "Nome: " + getString() + "\nAltura do tronco: " + getDouble() + 
    			"\nEsta florescendo: " + (isBoolean() ? "sim" : "nao");
    	
    }
	
}
