package TP3.TP3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client implements IRun, IClient{

	@Autowired
	private IFastLane Ifl;
	@Autowired
	private ILane	  Il;
	@Autowired
	private IJustHaveALook look;
	
	
	public void run() {
		Ifl.oneShotOrder(2);
	}

	

}
