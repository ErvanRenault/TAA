package TP3.TP3;


import org.springframework.stereotype.Component;


public class Article {
		
	private double prix;
	private int  ref;
	private int quantity;
	
	
	
	public Article(double prix, int ref, int q) {

		this.prix = prix;
		this.ref = ref;
		this.quantity = q;
	}
	
	
	public double getPrix(){
		return this.prix;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	
	public int getRef(){
		return ref;
	}
	
	
	
}
