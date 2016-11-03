package TP3.TP3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store implements  IStore, ILane, IFastLane, IJustHaveALook{

	
	@Autowired
	private IBank ibank;
	@Autowired
	private IProvider iprovider;
	
	
	private List<Article> lArticle = new ArrayList<Article>();
	private List<Article> cart = new ArrayList<Article>();
	
	
	
	public Store(){
		
		Articles();
		
	}
	


	public double getPrice(int ref) {
		for(Article a : lArticle){
			
			if (a.getRef() == ref)
				return a.getPrix();
		
		}
		return 0;
	}

	public boolean isAvailable(int ref) {
		for(Article a : lArticle){
		
			if (a.getRef() == ref)
				return true;
		
		}
		
			return false;
	}

	public void oneShotOrder(int nb) {
			if (isAvailable(nb)){
				System.out.println("Produit disponible");
				pay(getPrice(nb));
				System.out.println("Produit acheté");
			}
			else
				System.out.println("Produit indisponible");
		
	}

	public void addItemToCart(Article a) {
		this.cart.add(a);
		
	}

	public void pay(double prix) {
		ibank.transfert(prix);
		
	}
	
	
	public void Articles(){
		Article a1 = new Article(20, 0, 100);
		Article a2 = new Article(50, 1, 46);
		Article a3 = new Article(40, 2, 68);
		Article a4 = new Article(100, 3, 10);
		
		this.lArticle.add(a4);this.lArticle.add(a3);
		this.lArticle.add(a2);this.lArticle.add(a1);
	}


	
	

}
