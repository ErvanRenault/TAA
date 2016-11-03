package TP3.TP3;

import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank {
	
	private double compteA;
	private double compteB;
	
	
	public Bank(){
		
	}
	
	public void transfert(double montant) {
		
		
		this.compteA = this.compteA - montant;
		this.compteB = this.compteB + montant;
		
	}

	

}
